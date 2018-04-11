package com.test.pojo;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer sid;
	private String sname;
	private String loginuser;
	private String password;
	private String ssex;
	private String sbirthday;
	private String sphone;
	private Integer sclass;
	private String sidcard;
	private Integer jid;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer sid, String sname, String loginuser,
			String password, String ssex, Integer jid) {
		this.sid = sid;
		this.sname = sname;
		this.loginuser = loginuser;
		this.password = password;
		this.ssex = ssex;
		this.jid = jid;
	}

	/** full constructor */
	public Student(Integer sid, String sname, String loginuser,
			String password, String ssex, String sbirthday, String sphone,
			Integer sclass, String sidcard, Integer jid) {
		this.sid = sid;
		this.sname = sname;
		this.loginuser = loginuser;
		this.password = password;
		this.ssex = ssex;
		this.sbirthday = sbirthday;
		this.sphone = sphone;
		this.sclass = sclass;
		this.sidcard = sidcard;
		this.jid = jid;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getLoginuser() {
		return this.loginuser;
	}

	public void setLoginuser(String loginuser) {
		this.loginuser = loginuser;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSsex() {
		return this.ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSbirthday() {
		return this.sbirthday;
	}

	public void setSbirthday(String sbirthday) {
		this.sbirthday = sbirthday;
	}

	public String getSphone() {
		return this.sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public Integer getSclass() {
		return this.sclass;
	}

	public void setSclass(Integer sclass) {
		this.sclass = sclass;
	}

	public String getSidcard() {
		return this.sidcard;
	}

	public void setSidcard(String sidcard) {
		this.sidcard = sidcard;
	}

	public Integer getJid() {
		return this.jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

}