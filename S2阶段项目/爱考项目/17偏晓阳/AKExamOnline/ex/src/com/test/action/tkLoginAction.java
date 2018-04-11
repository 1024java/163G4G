package com.test.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.test.dao.BaseDaoImpl;
import com.test.hibernate.HibernateSessionFactory;
import com.test.pojo.Question;
import com.test.pojo.Subject;
import com.test.pojo.Tkfz;
import com.test.pojo.dlfz;

public class tkLoginAction {

	private dlfz user;//下拉框按条件查询
    private List list;
    private List<Tkfz> lis; //查询试题题数
    private Question que;
    private Question toque; //修改前的查询数据
    BaseDaoImpl dao=new BaseDaoImpl();
    
	//题库管理模块====================================================================================================================================
	public String tkcx(){
    lis=new ArrayList<Tkfz>();	
	String sql="select su.suId,su.suName,su.sustage,su.sudirec,(CASE WHEN tab3.num1 IS NULL THEN '0' ELSE tab3.num1 END)as num1,(CASE WHEN tab3.num2 IS NULL THEN '0' ELSE tab3.num2 END)as num2 from (select tab1.suid,tab1.num num1,tab2.num num2 from(select count(stype)num,suid  from question where stype='机试'  group by suid)as tab1 FULL  JOIN(select count(stype)num,suid  from question where stype='笔试'  group by suid)as tab2 on tab1.suid=tab2.suid)as tab3 right join subject su on su.suId=tab3.suid";	
	List<Object[]> tklist = dao.getObjectsql(sql);
	for(int i=0;i<tklist.size();i++){
	Object[] obj = tklist.get(i);
	Tkfz tk=new Tkfz();
	tk.setSuId(Integer.parseInt(obj[0].toString()));
	tk.setSuName(obj[1].toString());
	tk.setSustage(obj[2].toString());
	tk.setSudirec(obj[3].toString());
	tk.setNum1(obj[4].toString());
	tk.setNum2(obj[5].toString());
	lis.add(tk);
	}
	return "tkgl";
	}
    //题库按条件查询
	public String tksel(){
	String hql="select s from Subject s where s.sudirec=? or s.sustage=?";
	Session  session = HibernateSessionFactory.getSession();
	Transaction tx = session.beginTransaction();
	Query query = session.createQuery(hql);
	query.setString(0, user.getRole());
	query.setString(1, user.getRoles());
	list = query.list();
	return "tk_sel";	
	}
	//机试题超链接
	public String tkcx_js(){
	String hql="select q from Question q where q.suid=? and q.stype=?";
	Session  session = HibernateSessionFactory.getSession();
	Transaction tx = session.beginTransaction();
	Query query = session.createQuery(hql);
	query.setInteger(0, que.getSuid());
	query.setString(1, "机试");
	list= query.list();
	//获取suname放入session中
	HttpSession sess = ServletActionContext.getRequest().getSession(); 
	sess.setAttribute("suName", que.getSuName());
	sess.setAttribute("stype", "机试");
	return "tk_st";
	}
	//笔试题超链接
	public String tkcx_bs(){
	String hql="select q from Question q where q.suid=? and q.stype=?";
	Session  session = HibernateSessionFactory.getSession();
	Transaction tx = session.beginTransaction();
	Query query = session.createQuery(hql);
	query.setInteger(0,que.getSuid());
	query.setString(1, "笔试");
	list= query.list();
	//获取suname放入session中
	HttpSession sess = ServletActionContext.getRequest().getSession(); 
	sess.setAttribute("suName", que.getSuName());
	sess.setAttribute("stype", "笔试");
	return "tk_st";
	}
    //题库添加
	public String tkadd(){
	HttpSession sess = ServletActionContext.getRequest().getSession(); 
    String suName =sess.getAttribute("suName").toString();
    String stype = sess.getAttribute("stype").toString();
    //按suName条件 查询suID以供添加
    String hql="select s from Subject s where s.suName=?";
    Session  session = HibernateSessionFactory.getSession();
    Query query = session.createQuery(hql);
    query.setString(0, suName);
    List list2 = query.list();
    for(int i=0;i<list2.size();i++){
    Subject sub = (Subject)list2.get(i);
    que.setSuid(sub.getSuId());
    que.setStype(stype);
    }
    dao.add(que);	
	return "tk_st";		
	}
	//题库修改按条件查询1.1
	public String sel(){
	toque = (Question)dao.getObjectById(Question.class, que.getQid());
	return "tk_xgcx";	
	}
	//题库修改1.2
	public String tkupd(){
	Question q = (Question)dao.getObjectById(Question.class, que.getQid());
	q.setType(que.getType());
	q.setContent(que.getContent());
	q.setOptionA(que.getOptionA());
	q.setOptionB(que.getOptionB());
	q.setOptionC(que.getOptionC());
	q.setOptionD(que.getOptionD());
	q.setHard(que.getHard());
	q.setCharpter(que.getCharpter());
	q.setAnswer(que.getAnswer());
	dao.update(q);
	return null;	
	}
	//题库删除
	public String tkdel(){
		Question objectById = (Question)dao.getObjectById(Question.class, que.getQid());	
     dao.delete(objectById);
	return "tk_st";	
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
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
	public List<Tkfz> getLis() {
		return lis;
	}
	public void setLis(List<Tkfz> lis) {
		this.lis = lis;
	}
	public Question getToque() {
		return toque;
	}
	public void setToque(Question toque) {
		this.toque = toque;
	}
	
    

	
}
