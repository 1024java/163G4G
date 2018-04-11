package com.qhit.lh.g4.chen.exam.common.service.impl;

import com.qhit.lh.g4.chen.exam.common.bean.User;
import com.qhit.lh.g4.chen.exam.common.dao.UserDao;
import com.qhit.lh.g4.chen.exam.common.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.chen.exam.common.service.UserService;


public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public User login(User user){
		return userDao.login(user);
	}
	

}
