package org.danyuan.application.job;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 文件名 ： SysUserBaseInfo.java
 * 包 名 ： tk.ainiyue.admin.user.po
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： Administrator
 * 时 间 ： 2016年6月3日 下午5:51:10
 * 版 本 ： V1.0
 */
@Entity
@Table(name = "sys_user_base_info")
public class SysUserBaseInfo {
	
	@Id
	private String	uuid;
	
	private String	userName;
	
	private String	password;
	
	private String	persionName;
	
	private String	sex;
	
	private String	email;
	
	// 电话
	private String	phone;
	
	private Integer	age;
	
	private String	headPic;
	
	//
	private String	major;
	
	//
	private String	education;
	
	//
	private String	university;
	
	// QQ
	private String	qq;
	
	//
	private String	ancestralAddress;
	
	//
	private String	addr;

	//
	private String	position;

	//
	private String	statue;

	//
	private String	expectedPlace;

	//
	private String	workNature;

	//
	private String	expectedSalary;

	private String	resumePath;

	/**
	 * 方法名 ： getPosition
	 * 功 能 ： 返回变量 position 的值
	 *
	 * @return: String
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * 方法名 ： setPosition
	 * 功 能 ： 设置变量 position 的值
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * 方法名 ： getStatue
	 * 功 能 ： 返回变量 statue 的值
	 *
	 * @return: String
	 */
	public String getStatue() {
		return statue;
	}

	/**
	 * 方法名 ： setStatue
	 * 功 能 ： 设置变量 statue 的值
	 */
	public void setStatue(String statue) {
		this.statue = statue;
	}

	/**
	 * 方法名 ： getExpectedPlace
	 * 功 能 ： 返回变量 expectedPlace 的值
	 *
	 * @return: String
	 */
	public String getExpectedPlace() {
		return expectedPlace;
	}

	/**
	 * 方法名 ： setExpectedPlace
	 * 功 能 ： 设置变量 expectedPlace 的值
	 */
	public void setExpectedPlace(String expectedPlace) {
		this.expectedPlace = expectedPlace;
	}

	/**
	 * 方法名 ： getWorkNature
	 * 功 能 ： 返回变量 workNature 的值
	 *
	 * @return: String
	 */
	public String getWorkNature() {
		return workNature;
	}

	/**
	 * 方法名 ： setWorkNature
	 * 功 能 ： 设置变量 workNature 的值
	 */
	public void setWorkNature(String workNature) {
		this.workNature = workNature;
	}

	/**
	 * 方法名 ： getExpectedSalary
	 * 功 能 ： 返回变量 expectedSalary 的值
	 *
	 * @return: String
	 */
	public String getExpectedSalary() {
		return expectedSalary;
	}

	/**
	 * 方法名 ： setExpectedSalary
	 * 功 能 ： 设置变量 expectedSalary 的值
	 */
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	/**
	 * @方法名 getResumePath
	 * @功能 返回变量 resumePath 的值
	 * @return String
	 */
	public String getResumePath() {
		return resumePath;
	}

	/**
	 * @方法名 setResumePath
	 * @功能 设置变量 resumePath 的值
	 */
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
	
	/**
	 * 方法名 ： getUserName
	 * 功 能 ： 返回变量 userName 的值
	 *
	 * @return: String
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * 方法名 ： setUserName
	 * 功 能 ： 设置变量 userName 的值
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * 方法名 ： getPassword
	 * 功 能 ： 返回变量 password 的值
	 *
	 * @return: String
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 方法名 ： setPassword
	 * 功 能 ： 设置变量 password 的值
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 方法名 ： getPersionName
	 * 功 能 ： 返回变量 persionName 的值
	 *
	 * @return: String
	 */
	public String getPersionName() {
		return persionName;
	}
	
	/**
	 * 方法名 ： setPersionName
	 * 功 能 ： 设置变量 persionName 的值
	 */
	public void setPersionName(String persionName) {
		this.persionName = persionName;
	}
	
	/**
	 * 方法名 ： getSex
	 * 功 能 ： 返回变量 sex 的值
	 *
	 * @return: String
	 */
	public String getSex() {
		return sex;
	}
	
	/**
	 * 方法名 ： setSex
	 * 功 能 ： 设置变量 sex 的值
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * 方法名 ： getAge
	 * 功 能 ： 返回变量 age 的值
	 *
	 * @return: Integer
	 */
	public Integer getAge() {
		return age;
	}
	
	/**
	 * 方法名 ： setAge
	 * 功 能 ： 设置变量 age 的值
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * 方法名 ： getEmail
	 * 功 能 ： 返回变量 email 的值
	 *
	 * @return: String
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * 方法名 ： setEmail
	 * 功 能 ： 设置变量 email 的值
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 方法名 ： getPhone
	 * 功 能 ： 返回变量 phone 的值
	 *
	 * @return: String
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 方法名 ： setPhone
	 * 功 能 ： 设置变量 phone 的值
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 方法名 ： getHeadPic
	 * 功 能 ： 返回变量 headPic 的值
	 *
	 * @return: String
	 */
	public String getHeadPic() {
		return headPic;
	}
	
	/**
	 * 方法名 ： setHeadPic
	 * 功 能 ： 设置变量 headPic 的值
	 */
	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}
	
	/**
	 * 构造方法：
	 * 描 述： TODO(这里用一句话描述这个方法的作用)
	 * 参 数：
	 * 作 者 ： Administrator
	 * @throws
	 */
	public SysUserBaseInfo() {
		super();
	}
	
	/**
	 * 构造方法：
	 * 描 述： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @param uuid
	 * 作 者 ： Administrator
	 * @throws
	 */
	public SysUserBaseInfo(String uuid) {
		super();
		this.uuid = uuid;
	}

	/**
	 * @方法名 getMajor
	 * @功能 返回变量 major 的值
	 * @return String
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @方法名 setMajor
	 * @功能 设置变量 major 的值
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @方法名 getEducation
	 * @功能 返回变量 education 的值
	 * @return String
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @方法名 setEducation
	 * @功能 设置变量 education 的值
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @方法名 getUniversity
	 * @功能 返回变量 university 的值
	 * @return String
	 */
	public String getUniversity() {
		return university;
	}

	/**
	 * @方法名 setUniversity
	 * @功能 设置变量 university 的值
	 */
	public void setUniversity(String university) {
		this.university = university;
	}

	/**
	 * @方法名 getQq
	 * @功能 返回变量 qq 的值
	 * @return String
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @方法名 setQq
	 * @功能 设置变量 qq 的值
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * @方法名 getAncestralAddress
	 * @功能 返回变量 ancestralAddress 的值
	 * @return String
	 */
	public String getAncestralAddress() {
		return ancestralAddress;
	}

	/**
	 * @方法名 setAncestralAddress
	 * @功能 设置变量 ancestralAddress 的值
	 */
	public void setAncestralAddress(String ancestralAddress) {
		this.ancestralAddress = ancestralAddress;
	}

	/**
	 * @方法名 getAddr
	 * @功能 返回变量 addr 的值
	 * @return String
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @方法名 setAddr
	 * @功能 设置变量 addr 的值
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public SysUserBaseInfo(String uuid, String userName, String password) {
		super();
		this.uuid = uuid;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * TODO(这里用一句话描述这个方法的作用)
	 *
	 * @方法名 toString
	 * @参数 @return
	 * @参考 @see java.lang.Object#toString()
	 * @author Administrator
	 */
	
	@Override
	public String toString() {
		return "SysUserBaseInfo [uuid=" + uuid + ", userName=" + userName + ", password=" + password + ", persionName=" + persionName + ", sex=" + sex + ", email=" + email + ", phone=" + phone + ", age=" + age + ", headPic=" + headPic + ", major=" + major + ", education=" + education + ", university=" + university + ", qq=" + qq + ", ancestralAddress=" + ancestralAddress + ", addr=" + addr + ", position=" + position + ", statue=" + statue + ", expectedPlace=" + expectedPlace + ", workNature=" + workNature + ", expectedSalary=" + expectedSalary + ", resumePath=" + resumePath + "]";
	}

	public String toLine() {
		return userName + ", " + password + ", " + email + ", " + age + "," + education;
	}
	
}
