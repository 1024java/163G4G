package com.test.pojo;

/**
 * Subject entity. @author MyEclipse Persistence Tools
 */

public class Subject implements java.io.Serializable {

	// Fields

	private Integer suId;
	private String sudirec;
	private String sustage;
	private String suName;

	// Constructors

	/** default constructor */
	public Subject() {
	}

	/** full constructor */
	public Subject(Integer suId, String sudirec, String sustage, String suName) {
		this.suId = suId;
		this.sudirec = sudirec;
		this.sustage = sustage;
		this.suName = suName;
	}

	// Property accessors

	public Integer getSuId() {
		return this.suId;
	}

	public void setSuId(Integer suId) {
		this.suId = suId;
	}

	public String getSudirec() {
		return this.sudirec;
	}

	public void setSudirec(String sudirec) {
		this.sudirec = sudirec;
	}

	public String getSustage() {
		return this.sustage;
	}

	public void setSustage(String sustage) {
		this.sustage = sustage;
	}

	public String getSuName() {
		return this.suName;
	}

	public void setSuName(String suName) {
		this.suName = suName;
	}

}