package org.danyuan.application.imp;

import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Component;

/**
 * @文件名 MyItemWriterDemo.java
 * @包名 org.danyuan.application.job
 * @描述 TODO(用一句话描述该文件做什么)
 * @时间 2019年11月1日 上午10:31:03
 * @author Administrator
 * @版本 V1.0
 */
@Component
public class MyItemWriterDemo2 implements ItemWriter<Map<String, Object>> {
	/**
	 * TODO(这里用一句话描述这个方法的作用)
	 *
	 * @方法名 write
	 * @参数 @param arg0
	 * @参数 @throws Exception
	 * @参考 @see org.springframework.batch.item.ItemWriter#write(java.util.List)
	 * @author Administrator
	 */
	
	@Override
	public void write(List<? extends Map<String, Object>> items) throws Exception {
		
//		JdbcBatchItemWriter<Map<String, Object>> writer = new JdbcBatchItemWriter<>();
		DataSource dataSource = DataSourceBuilder.create().driverClassName("com.mysql.cj.jdbc.Driver").url("jdbc:mysql:///application?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC&zeroDateTimeBehavior=convertToNull&autoReconnect=true&failOverReadOnly=false").username("root").password("514840279@qq.com").build();
//		writer.setDataSource(dataSource);
		Statement statement = dataSource.getConnection().createStatement();
		//
		Iterator<? extends Map<String, Object>> map = items.iterator();
		while (map.hasNext()) {
			StringBuilder stringBuilder = new StringBuilder();
			Map<String, Object> row = map.next();
			Set<String> set = row.keySet();
			Iterator<? extends String> columns = set.iterator();
			stringBuilder.append("insert into qiy2000(`");
			while (columns.hasNext()) {
				stringBuilder.append(columns.next());
				if (columns.hasNext()) {
					stringBuilder.append("`,`");
				}
			}
			stringBuilder.append("`) values('");
			columns = set.iterator();
			while (columns.hasNext()) {
				stringBuilder.append(row.get(columns.next()));
				if (columns.hasNext()) {
					stringBuilder.append("','");
				}
			}
			stringBuilder.append("')");
			System.out.println(stringBuilder.toString());
			statement.execute(stringBuilder.toString());
		}
//		writer.setSql(stringBuilder.toString());

//		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Map<String, Object>>());
		
	}

}
