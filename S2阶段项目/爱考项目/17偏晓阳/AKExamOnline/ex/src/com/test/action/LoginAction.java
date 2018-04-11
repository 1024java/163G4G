package com.test.action;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;
import com.test.dao.BaseDaoImpl;
import com.test.hibernate.HibernateSessionFactory;
import com.test.pojo.Adminuser;
import com.test.pojo.Juese;
import com.test.pojo.Subject;
import com.test.pojo.Teacher;
import com.test.pojo.dlfz;

public class LoginAction {
	
	private dlfz user;//登录值栈
    private List list;//教师查询   //教师按条件查询   
    private Teacher tea; //教师添加
    private Teacher t; //教师修改按条件查询
	BaseDaoImpl dao=new BaseDaoImpl();
	
   //登录验证模块 ====================================================================================================================================
	public String dl(){
	if(user.getRole().equals("3")){	
	   String hql="select a from Adminuser a where a.loginuser=? and a.password=?";  	
	   Session  session1 = HibernateSessionFactory.getSession();
	   Transaction tx = session1.beginTransaction();
	   Query query = session1.createQuery(hql);
	   query.setString(0, user.getName());
	   query.setString(1, user.getPwd());
	   Object uniqueResult = query.uniqueResult();
       if(uniqueResult==null){
       return "login";
       }else{
       HttpSession session = ServletActionContext.getRequest().getSession();   
       session.setAttribute("nameqx", "3");
       return "index";}
	   }
	else if(user.getRole().equals("2")){	
		String hql="select t from Teacher t where t.loginuser=? and t.password=?";  	
		Session  session1 = HibernateSessionFactory.getSession();
		Transaction tx = session1.beginTransaction();
		Query query = session1.createQuery(hql);
		query.setString(0, user.getName());
		query.setString(1, user.getPwd());
		Object uniqueResult = query.uniqueResult();
	    if(uniqueResult==null){
	    return "login";
	    }else{
	    HttpSession session = ServletActionContext.getRequest().getSession();   
	    session.setAttribute("nameqx", "2");
	    return "index";}
		}
	else if(user.getRole().equals("1")){	
		String hql="select s from Student s where s.loginuser=? and s.password=?";  	
		Session  session1 = HibernateSessionFactory.getSession();
		Transaction tx = session1.beginTransaction();
		Query query = session1.createQuery(hql);
		query.setString(0, user.getName());
		query.setString(1, user.getPwd());
		Object uniqueResult = query.uniqueResult();
	    if(uniqueResult==null){
	    return "login";
	    }else{
	    HttpSession session = ServletActionContext.getRequest().getSession();   
	    session.setAttribute("nameqx", "1");
	    return "index";}
		}
	return "login";
	}
   //教师模块全部查询 ====================================================================================================================================
    public String jscx(){
    list = dao.getObjects("from Teacher");
    for(int i=0;i<list.size();i++){
    Teacher object =(Teacher)list.get(i);	
    }
	return "jsgl";
}
   //教师添加	
	public String jsadd(){
	Juese objectById =(Juese) dao.getObjectById(Juese.class, new Integer(2));
	Integer jid = objectById.getJid();
	tea.setJid(jid);
    dao.add(tea);
	return "tolist";
	} 
   //教师修改按条件查询
	public String jssel(){
	t =(Teacher)dao.getObjectById(Teacher.class,tea.getTid());
	return "jsgl_sel";
	}
   //教师修改
	public String jsupd(){
	Teacher	t1=(Teacher)dao.getObjectById(Teacher.class, tea.getTid());	
	t1.setLoginuser(tea.getLoginuser());
	t1.setTname(tea.getTname());
	t1.setPassword(tea.getPassword());
	t1.setTsex(tea.getTsex());
	t1.setTbirthday(tea.getTbirthday());
	t1.setTeducation(tea.getTeducation());
	t1.setTphone(tea.getTphone());
	t1.setTgangwei(tea.getTgangwei());
	t1.setTbeizhu(tea.getTbeizhu());
    dao.update(t1);
	return "jsgl";
	}
   //教师删除	 
	public String jsdel(){
	Object objectById = dao.getObjectById(Teacher.class, tea.getTid());
	dao.delete(objectById);
	return "tolist";		
	}
   //教师重置密码
	public String jsmm(){
	Teacher objectById =(Teacher) dao.getObjectById(Teacher.class, tea.getTid());
	objectById.setPassword("123456");
	dao.update(objectById);	
	return "tolist";
	}
   //教师按条件查询
	public String tosel(){
	if(!user.getJszh().equals("")){
	 String hql="select t from Teacher t where t.loginuser=?";
	 Session  session2 = HibernateSessionFactory.getSession();
	 Query query = session2.createQuery(hql);
	 query.setString(0, user.getJszh());
	 list = query.list();
	 session2.close();
	}else if(!user.getJsxm().equals("")){
	 String hql="select t from Teacher t where t.tname=?";
	 Session  session2 = HibernateSessionFactory.getSession();
	 Query query = session2.createQuery(hql);
	 query.setString(0, user.getJsxm());
	 list = query.list();
	 session2.close();	
	}else if(!user.getRole().equals("")){
	 String hql="select t from Teacher t where t.tgangwei=?";
	 Session  session2 = HibernateSessionFactory.getSession();
	 Query query = session2.createQuery(hql); 	 
	 query.setString(0, user.getRole());
	 list = query.list();
     session2.close();	
	}
	return "tosel";
	}

	public dlfz getUser() {
		return user;
	}
	public void setUser(dlfz user) {
		this.user = user;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Teacher getTea() {
		return tea;
	}
	public void setTea(Teacher tea) {
		this.tea = tea;
	}
	public Teacher getT() {
		return t;
	}
	public void setT(Teacher t) {
		this.t = t;
	}
	
}
