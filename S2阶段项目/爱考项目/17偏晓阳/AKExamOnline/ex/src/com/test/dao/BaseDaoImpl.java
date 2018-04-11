package com.test.dao;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.test.hibernate.HibernateSessionFactory;

public class BaseDaoImpl  implements IBaseDao{

	@Override
	public void add(Object obj) {
		
//		Userinfo t= new Userinfo();
//		t.setName("222");
//		
//		t_emp m = new t_emp();
//		m.setEno("333");
//		
//		t.setEmp(m);
//		m.setUserinfo(t);
		Session  session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try{
			session.save(obj);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}
		
		HibernateSessionFactory.closeSession();
	} 

	@Override
	public void delete(Object obj) {
		Session  session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try{
			session.delete(obj);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}
		
		HibernateSessionFactory.closeSession();	}

	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		Session  session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Object obj = null;
		try{
		obj = session.get(clazz, id);
		tx.commit();
		}catch(Exception e){
		tx.rollback();
		e.printStackTrace();
		}	
		HibernateSessionFactory.closeSession();
		return obj;
	}

	public List getObjects(String hql) {
		Session  session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		List result = new ArrayList();
		try{
		result=session.createQuery(hql).list();
		tx.commit();
		}catch(Exception e){
	    tx.rollback();
		e.printStackTrace();
		}	
		HibernateSessionFactory.closeSession();
		return result;
	}
	
	public List getObjectsql(String sql) {
		Session  session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		List result = new ArrayList();
		try{
		result=session.createSQLQuery(sql).list();
		tx.commit();
		}catch(Exception e){
	    tx.rollback();
		e.printStackTrace();
		}	
		HibernateSessionFactory.closeSession();
		return result;
	}

	
	
	@Override
	public void update(Object obj) {
		Session  session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try{
		session.update(obj);
		tx.commit();
		}catch(Exception e){
		tx.rollback();
		e.printStackTrace();
		}
		HibernateSessionFactory.closeSession();
	}
	



}
