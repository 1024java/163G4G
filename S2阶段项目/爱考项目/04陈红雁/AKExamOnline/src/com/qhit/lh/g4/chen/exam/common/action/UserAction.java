package com.qhit.lh.g4.chen.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.chen.exam.common.bean.User;
import com.qhit.lh.g4.chen.exam.common.service.UserService;
import com.qhit.lh.g4.chen.exam.common.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport {
	
	private UserService userService = new UserServiceImpl();
	
	private User user ;
	

	public String login(){
		user = userService.login(user);
		if(user != null ){
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "loginSuccess";
		}else{
			super.addActionError("登录错误。用户密码错误");
			return "loginFail";
		}
			
	}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
}
