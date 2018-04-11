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
<script language="javascript">
$(function(){
 $("#qx").click(function(){
  window.close();
  });
 
 $("#qd").click(function(){  
  $.ajax({
  type:"post",
  async:true, 
  url:"",
  date:$("#f1").serialize(),
  success:function(){
  alert("添加成功");
  window.close();
  }
  });
  
 });
 
});
</script>
<body>
<h3 align="center">教师添加</h3>
<s:form action="/login!jsadd" theme="simple" method="post" id="f1">
&nbsp;&nbsp;&nbsp;&nbsp;账号:<s:textfield name="tea.loginuser" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;密码:<s:textfield name="tea.password" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;姓名:<s:textfield name="tea.tname" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;性别:<s:select name="tea.tsex" list="{'男','女'}" style="width:60px;" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;生日:<s:textfield name="tea.tbirthday" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;学历:<s:textfield name="tea.teducation" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;电话:<s:textfield name="tea.tphone" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;岗位:<s:select name="tea.tgangwei" list="{'讲师','班主任'}" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;备注:<s:textarea name="tea.tbeizhu" cols="28" rows="4" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<s:submit value="确定" id="qd" style="width:70px;height:30px"  />
&nbsp;<input type="button" value="取消" id="qx" style="width:70px;height:30px" />
</s:form>
</body>
</html>