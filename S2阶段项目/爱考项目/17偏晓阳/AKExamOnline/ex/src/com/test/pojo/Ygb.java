package com.test.pojo;

/**
 * Ygb entity. @author MyEclipse Persistence Tools
 */

public class Ygb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String types;
	private String date;
	private Integer oid;

	// Constructors

	/** default constructor */
	public Ygb() {
	}

	/** minimal constructor */
	public Ygb(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Ygb(Integer id, String username, String password, String types,
			String date, Integer oid) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.types = types;
		this.date = date;
		this.oid = oid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getOid() {
		return this.oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

}