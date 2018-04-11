<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript">
$(function(){
 $("#qx").click(function(){
 window.close();
 });
 
 $("#qd").click(function(){
 window.opener.location.reload();
 });
 
});
</script>
<body>
<h3 align="center">教师修改</h3>
<s:form action="login!jsupd" theme="simple">
<s:hidden name="tea.tid" />
&nbsp;&nbsp;&nbsp;&nbsp;账号:<s:textfield name="tea.loginuser" value="%{t.loginuser}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;密码:<s:textfield name="tea.password" value="%{t.password}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;姓名:<s:textfield name="tea.tname" value="%{t.tname}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;性别:<s:select name="tea.tsex" list="{'男','女'}" style="width:60px;" value="%{t.tsex}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;生日:<s:textfield name="tea.tbirthday" value="%{t.tbirthday}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;学历:<s:textfield name="tea.teducation" value="%{t.teducation}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;电话:<s:textfield name="tea.tphone" value="%{t.tphone}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;岗位:<s:select name="tea.tgangwei" list="{'讲师','班主任'}" value="%{t.tgangwei}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;备注:<s:textarea name="tea.tbeizhu" cols="28" rows="4" value="%{t.tbeizhu}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:submit value="确定" id="qd" style="width:70px;height:30px" />
&nbsp;<input type="button" value="取消" id="qx" style="width:70px;height:30px" />
</s:form>