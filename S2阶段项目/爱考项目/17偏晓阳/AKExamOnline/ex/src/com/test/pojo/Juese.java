package com.test.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Juese entity. @author MyEclipse Persistence Tools
 */

public class Juese implements java.io.Serializable {

	// Fields

	private Integer jid;
	private String jname;
	
	private Teacher teacher; //角色与教师一对一映射
	// Constructors

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/** default constructor */
	public Juese() {
	}

	/** full constructor */
	public Juese(Integer jid, String jname) {
		this.jid = jid;
		this.jname = jname;
	}

	// Property accessors

	public Integer getJid() {
		return this.jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

	public String getJname() {
		return this.jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

}