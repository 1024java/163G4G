package com.test.pojo;

/**
 * Paper entity. @author MyEclipse Persistence Tools
 */

public class Paper implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String ptype;
	private String suname;
	private String ptitle;
	private Double ptotal;
	private Integer ptime;
	private Integer ptotalNum;
	private Integer pone;
	
	private String scount;

	// Constructors

	/** default constructor */
	public Paper() {
	}

	/** full constructor */
	public Paper(Integer pid, String ptype, String suname, String ptitle,
			Double ptotal, Integer ptime, Integer ptotalNum, Integer pone) {
		this.pid = pid;
		this.ptype = ptype;
		this.suname = suname;
		this.ptitle = ptitle;
		this.ptotal = ptotal;
		this.ptime = ptime;
		this.ptotalNum = ptotalNum;
		this.pone = pone;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPtype() {
		return this.ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getSuname() {
		return this.suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	public String getPtitle() {
		return this.ptitle;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public Double getPtotal() {
		return this.ptotal;
	}

	public void setPtotal(Double ptotal) {
		this.ptotal = ptotal;
	}

	public Integer getPtime() {
		return this.ptime;
	}

	public void setPtime(Integer ptime) {
		this.ptime = ptime;
	}

	public Integer getPtotalNum() {
		return this.ptotalNum;
	}

	public void setPtotalNum(Integer ptotalNum) {
		this.ptotalNum = ptotalNum;
	}

	public Integer getPone() {
		return this.pone;
	}

	public void setPone(Integer pone) {
		this.pone = pone;
	}

	public String getScount() {
		return scount;
	}

	public void setScount(String scount) {
		this.scount = scount;
	}
}