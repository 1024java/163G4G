package com.qhit.lh.g4.chen.exam;


import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.lh.g4.chen.exam.common.bean.Student;
import com.qhit.lh.g4.chen.exam.common.bean.User;
import com.qhit.lh.g4.chen.exam.common.dao.BaseDao;

public class StudentTest extends BaseDao{
	@Test
	public void add(){
		Student student = new Student();
		student.setSname("张三");
		student.setSex("男");
		student.setEnterSchool("2016");
		
		User user = new User();
		user.setName("16030221001");
		user.setPwd("123456");
		user.setRole(1);
		
		
		student.setUser(user);
		
		Transaction ts = getSession().beginTransaction();
		getSession().save(student);
		ts.commit();
	}

}
