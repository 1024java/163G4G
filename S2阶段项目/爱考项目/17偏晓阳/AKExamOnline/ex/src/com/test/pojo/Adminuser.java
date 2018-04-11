package com.test.pojo;

/**
 * Adminuser entity. @author MyEclipse Persistence Tools
 */

public class Adminuser implements java.io.Serializable {

	// Fields

	private Integer aid;
	private String loginuser;
	private String password;
	private Integer jid;
	

	// Constructors

	/** default constructor */
	public Adminuser() {
	}

	/** full constructor */
	public Adminuser(Integer aid, String loginuser, String password, Integer jid) {
		this.aid = aid;
		this.loginuser = loginuser;
		this.password = password;
		this.jid = jid;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
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

	public Integer getJid() {
		return this.jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

}