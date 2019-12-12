/**
 *
 */
package org.danyuan.application.imp;

import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.Order;
import org.springframework.batch.item.database.support.SqlServerPagingQueryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wth
 */
@Configuration
public class Testaccess {

	// 负责创建任务
	@Autowired
	private JobBuilderFactory	jobBuilderFactory;
	
	// 负责创建step 任务由step决定
	@Autowired
	private StepBuilderFactory	stepBuilderFactory;
	
	@Autowired
	private MyItemWriterDemo2	myItemWriterDemo2;
	
	// 创建job 数据库读取
	@Bean
	public Job jdbcItemReadJobDemo() {
		
		return jobBuilderFactory
		        // 名称是job的标识符，
		        .get("jdbcItemReadJobDemo")
		        // 新增incrementer(new RunIdIncrementer())的配置使每个job的运行id都唯一
		        .incrementer(new RunIdIncrementer())
		        // 添加step
		        .start(jdbcitemReadstepDemo())
		        //
		        .build();
	}

	/**
	 * @方法名 itemReadstepDemo
	 * @功能 TODO(这里用一句话描述这个方法的作用)
	 * @参数 @return
	 * @返回 Step
	 * @author Administrator
	 * @throws
	 */
	@Bean
	public Step jdbcitemReadstepDemo() {
		return stepBuilderFactory.get("jdbcitemReadstepDemo")
		        // 创建 tasklet 或者chunk（itemread，itemprocess，itemwrite）
		        .<Map<String, Object>, Map<String, Object>> chunk(1000)
		        // 读取对象
		        .reader(jdbcitemReaderDemo())
		        // 测试输出
		        .writer(myItemWriterDemo2)
				// 自定义输出到文件
//		        .writer(myFlatFileItemWriter)
				// 自定义输出到xml中
//		        .writer(xlmFileWrite)
				// 输出到多个文件
//		        .writer(multifileItermWrite)
		        //
		        .build();
	}

	/**
	 * @方法名 itemReaderDemo
	 * @功能 TODO(这里用一句话描述这个方法的作用)
	 * @参数 @return
	 * @返回 ItemReader<? extends String>
	 * @author Administrator
	 * @throws
	 */
	@Bean
	@StepScope
	public JdbcPagingItemReader<Map<String, Object>> jdbcitemReaderDemo() {
		JdbcPagingItemReader<Map<String, Object>> reader = new JdbcPagingItemReader<>();
		DataSource dataSource = DataSourceBuilder.create().driverClassName("net.ucanaccess.jdbc.UcanaccessDriver").url("jdbc:ucanaccess://" + "F:\\2000年企业数据库.mdb").build();
		// 设置数据源
		reader.setDataSource(dataSource);
		// 每次读取记录数
		reader.setFetchSize(100);
		
		// 结果映射对象
		reader.setRowMapper((rs, rownum) -> {
			ResultSetMetaData metaData = rs.getMetaData();
			int count = metaData.getColumnCount();
			Map<String, Object> map = new HashMap<>();
			for (int i = 1; i <= count; i++) {
				String columnName = metaData.getColumnName(i);
				map.put(columnName, rs.getObject(columnName));
			}
			return map;
		});
		// 指定查询语句

//		MySqlPagingQueryProvider pagingQueryProvider = new MySqlPagingQueryProvider();
		SqlServerPagingQueryProvider pagingQueryProvider = new SqlServerPagingQueryProvider();
//		OraclePagingQueryProvider pagingQueryProvider = new OraclePagingQueryProvider();
		pagingQueryProvider.setSelectClause("*");
		pagingQueryProvider.setFromClause(" From `2000` ");
		// 排序
		Map<String, Order> sort = new HashMap<>();
		sort.put("法人代码", Order.ASCENDING);
		pagingQueryProvider.setSortKeys(sort);

		//
		reader.setQueryProvider(pagingQueryProvider);

		return reader;
	}
}
