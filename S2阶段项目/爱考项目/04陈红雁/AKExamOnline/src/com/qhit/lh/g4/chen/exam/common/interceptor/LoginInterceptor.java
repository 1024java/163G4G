package com.qhit.lh.g4.chen.exam.common.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.qhit.lh.g4.chen.exam.common.bean.User;
import com.qhit.lh.g4.chen.exam.common.utils.Constans;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user == null){
			return Constans.VIEW_LOGIN;
		}
		return null;
	}

}
