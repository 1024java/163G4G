package com.test.pojo;

/**
 * Table3 entity. @author MyEclipse Persistence Tools
 */

public class Table3 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String sex;
	private Integer taohao;
	private String mima;
	private String rili;
	private String lxfs;
	private String xqah;
	private String jtdz;

	// Constructors

	/** default constructor */
	public Table3() {
	}

	/** minimal constructor */
	public Table3(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Table3(Integer id, String name, String sex, Integer taohao,
			String mima, String rili, String lxfs, String xqah, String jtdz) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.taohao = taohao;
		this.mima = mima;
		this.rili = rili;
		this.lxfs = lxfs;
		this.xqah = xqah;
		this.jtdz = jtdz;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getTaohao() {
		return this.taohao;
	}

	public void setTaohao(Integer taohao) {
		this.taohao = taohao;
	}

	public String getMima() {
		return this.mima;
	}

	public void setMima(String mima) {
		this.mima = mima;
	}

	public String getRili() {
		return this.rili;
	}

	public void setRili(String rili) {
		this.rili = rili;
	}

	public String getLxfs() {
		return this.lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}

	public String getXqah() {
		return this.xqah;
	}

	public void setXqah(String xqah) {
		this.xqah = xqah;
	}

	public String getJtdz() {
		return this.jtdz;
	}

	public void setJtdz(String jtdz) {
		this.jtdz = jtdz;
	}

}