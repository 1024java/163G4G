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
td{ text-align:center; }
</style>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script language="javascript">
 $(function(){
 $("#d1").click(function(){
  var iWidth=400;                          //弹出窗口的宽度; 
  var iHeight=510;                         //弹出窗口的高度; 
  var iTop = (window.screen.availHeight - 30 - iHeight) / 2; 
  var iLeft = (window.screen.availWidth - 10 - iWidth) / 2; 
  window.open('jsgl_add.jsp','teach', 'height=' + iHeight + ',,innerHeight=' + iHeight + ',width=' + iWidth + ',innerWidth=' + iWidth + ',top=' + iTop + ',left=' + iLeft + ',status=no,toolbar=no,menubar=no,location=no,resizable=no,scrollbars=0,titlebar=no'); 
 });
 });
 var fun=function(){
  var iWidth=400;                          //弹出窗口的宽度; 
  var iHeight=510;                         //弹出窗口的高度; 
  var iTop = (window.screen.availHeight - 30 - iHeight) / 2; 
  var iLeft = (window.screen.availWidth - 10 - iWidth) / 2; 
  window.open('jsgl_upd.jsp','teach', 'height=' + iHeight + ',,innerHeight=' + iHeight + ',width=' + iWidth + ',innerWidth=' + iWidth + ',top=' + iTop + ',left=' + iLeft + ',status=no,toolbar=no,menubar=no,location=no,resizable=no,scrollbars=0,titlebar=no'); 
 };
</script>
<body>
<h3 align="center">教师列表</h3>
<input type="button" value="添加教师" id="d1"><br><br>
<s:form action="login!tosel" theme="simple">
账号：<s:textfield name="user.jszh" />&nbsp;
教师姓名：<s:textfield name="user.jsxm" />&nbsp;
岗位：<select name="user.role" style="width: 100px;height:25px">
    <option value=""></option>
	<option value="讲师">讲师</option>
	<option value="班主任">班主任</option> 
	</select>&nbsp;
<s:submit value="查询" style="width: 80px;height:25px" /><br><br>
<table border="1" style="width: 1000px">
<tr bgcolor="#8A8A8A">
<td>序号</td>
<td>账号</td>
<td>姓名</td>
<td>性别</td>
<td>生日</td>
<td>学历</td>
<td>联系电话</td>
<td>岗位</td>
<td>操作</td>
</tr>
<s:iterator value="list" var="lis">
<tr>
<td><s:property value="#lis.tid" /></td>
<td><s:property value="#lis.loginuser" /></td>
<td><s:property value="#lis.tname" /></td>
<td><s:property value="#lis.tsex" /></td>
<td><s:property value="#lis.tbirthday" /></td>
<td><s:property value="#lis.teducation" /></td>
<td><s:property value="#lis.tphone" /></td>
<td><s:property value="#lis.tgangwei" /></td>
<td>
<s:a href="javascript:fun();">编辑</s:a>  
<s:a href="/exam/login!jsmm?tea.tid=%{#lis.tid}">重置密码 </s:a> 
<s:a href="/exam/login!jsdel?tea.tid=%{#lis.tid}">删除</s:a>
</td>
</tr>
</s:iterator>
</table>
</s:form>
</body>
</html>