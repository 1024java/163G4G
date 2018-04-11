package com.test.pojo;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer tid;
	private String tname;
	private String tsex;
	private String tbirthday;
	private String teducation;
	private String tphone;
	private String tgangwei;
	private String loginuser;
	private String password;
	private String tbeizhu;
	private Integer jid;

	private Juese juese;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Integer tid, String tname, String tsex, String tphone,
			String tgangwei, String loginuser, String password, Integer jid) {
		this.tid = tid;
		this.tname = tname;
		this.tsex = tsex;
		this.tphone = tphone;
		this.tgangwei = tgangwei;
		this.loginuser = loginuser;
		this.password = password;
		this.jid = jid;
	}

	/** full constructor */
	public Teacher(Integer tid, String tname, String tsex, String tbirthday,
			String teducation, String tphone, String tgangwei,
			String loginuser, String password, String tbeizhu, Integer jid) {
		this.tid = tid;
		this.tname = tname;
		this.tsex = tsex;
		this.tbirthday = tbirthday;
		this.teducation = teducation;
		this.tphone = tphone;
		this.tgangwei = tgangwei;
		this.loginuser = loginuser;
		this.password = password;
		this.tbeizhu = tbeizhu;
		this.jid = jid;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsex() {
		return this.tsex;
	}

	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

	public String getTbirthday() {
		return this.tbirthday;
	}

	public void setTbirthday(String tbirthday) {
		this.tbirthday = tbirthday;
	}

	public String getTeducation() {
		return this.teducation;
	}

	public void setTeducation(String teducation) {
		this.teducation = teducation;
	}

	public String getTphone() {
		return this.tphone;
	}

	public void setTphone(String tphone) {
		this.tphone = tphone;
	}

	public String getTgangwei() {
		return this.tgangwei;
	}

	public void setTgangwei(String tgangwei) {
		this.tgangwei = tgangwei;
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

	public String getTbeizhu() {
		return this.tbeizhu;
	}

	public void setTbeizhu(String tbeizhu) {
		this.tbeizhu = tbeizhu;
	}

	public Integer getJid() {
		return this.jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

	public Juese getJuese() {
		return juese;
	}

	public void setJuese(Juese juese) {
		this.juese = juese;
	}
	
}