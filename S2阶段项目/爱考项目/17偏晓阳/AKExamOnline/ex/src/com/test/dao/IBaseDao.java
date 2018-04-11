package com.test.dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao {
	public void add(Object obj);
	public void update(Object obj);
	public void delete(Object obj);
	
	public Object  getObjectById(Class  clazz, Serializable id);
	public List getObjects(String hql);
	public List getObjectsql(String sql); 
	
}
