<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
*{
margin:0px;
padding:0px;}
td{
width:300px;
height:80px;
border: 1px solid #0F0F0F;
}
table{
border-spacing:20px;
}
a{ text-decoration:none}
</style>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script language="javascript">
$(function(){
  $("#s1").change(function(){
   $("#f1").submit();
  });
  
  $("#s2").change(function(){
  $("#f1").submit();
  });
  
 });
</script>
<body>
<br>
<s:form action="tklogin!tksel" id="f1">
&nbsp;&nbsp;<select name="user.role" style="width: 100px;height:25px" id="s1">
	<option value="">请选择</option> 
    <option value="工程师">工程师</option>
	<option value="美工师">美工师</option>
	<option value="架构师">架构师</option> 
	<option value="建模师">建模师</option> 
</select>
	
<select name="user.roles" style="width: 100px;height:25px" id="s2">
	<option value="">请选择</option> 
    <option value="G1">G1</option>
	<option value="G2">G2</option>
	<option value="G3">G3</option> 
</select><br><br>

<table>
<s:iterator value="lis" var="lis"  status="status">
<td align="center">
<s:property value="#lis.suName" />&nbsp;
<s:property value="#lis.sustage" /><br>
<s:a href="/exam/tklogin!tkcx_js?que.suid=%{#lis.suId}&que.suName=%{#lis.suName}">机试题：<s:property value="#lis.num1" /></s:a><br>
<s:a href="/exam/tklogin!tkcx_bs?que.suid=%{#lis.suId}&que.suName=%{#lis.suName}">笔试题：<s:property value="#lis.num2" /></s:a>
<s:if test="(#status.index-2) % 3==0"><tr></s:if>
</td>
</s:iterator>
</table>
</s:form>
</body>
</html>