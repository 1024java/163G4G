package com.test.pojo;

/**
 * Paperinfo entity. @author MyEclipse Persistence Tools
 */

public class Paperinfo implements java.io.Serializable {

	// Fields

	private Integer piid;
	private Integer qid;
	private Integer pid;

	// Constructors

	/** default constructor */
	public Paperinfo() {
	}

	/** full constructor */
	public Paperinfo(Integer piid, Integer qid, Integer pid) {
		this.piid = piid;
		this.qid = qid;
		this.pid = pid;
	}

	// Property accessors

	public Integer getPiid() {
		return this.piid;
	}

	public void setPiid(Integer piid) {
		this.piid = piid;
	}

	public Integer getQid() {
		return this.qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

}