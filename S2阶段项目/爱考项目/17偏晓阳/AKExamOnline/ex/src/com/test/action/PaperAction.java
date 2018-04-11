package com.test.action;

import java.util.List;

import com.test.dao.BaseDaoImpl;
import com.test.pojo.Paper;
import com.test.pojo.dlfz;

public class PaperAction {
	
	private List list;
	
	private dlfz user;
	
	private Paper pap;

	BaseDaoImpl dao=new BaseDaoImpl();
	
	//试卷查询模块============================================================================
	public String sjcx(){
		list = dao.getObjects("from Paper");
	return "sjgl";
	}
	//随机组卷添加============================================================================
	public String randomAdd(){
		System.out.println(pap.getPtitle()+pap.getPtype()+user.getRoless());
	//	dao.add(pap);
		return "sjgl";
	}
	

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	public Paper getPap() {
		return pap;
	}
	public void setPap(Paper pap) {
		this.pap = pap;
	}
	
	
}


