<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
 function revoke(){
 alert("结束考试");
 }
 function random(){
  var iWidth=550;                          //弹出窗口的宽度; 
  var iHeight=510;                         //弹出窗口的高度; 
  var iTop = (window.screen.availHeight - 30 - iHeight) / 2; 
  var iLeft = (window.screen.availWidth - 10 - iWidth) / 2; 
  window.open('paper_random.jsp','teach', 'height=' + iHeight + ',,innerHeight=' + iHeight + ',width=' + iWidth + ',innerWidth=' + iWidth + ',top=' + iTop + ',left=' + iLeft + ',status=no,toolbar=no,menubar=no,location=no,resizable=no,scrollbars=0,titlebar=no'); 
 }
</script>
<style type="text/css">
*{
margin: 0px;
padding: 0px;}
select{
width: 70px;
height: 25px;
}
input{
width: 70px;
height: 25px;
}
td{ text-align:center; }
</style>
<body>
<h2 align="center">试卷列表</h2><br>
<s:form action="" theme="simple">
&nbsp;方向：<select name="user.role" >
	<option value="">请选择</option> 
    <option value="工程师">工程师</option>
	<option value="美工师">美工师</option>
	<option value="架构师">架构师</option> 
	<option value="建模师">建模师</option> 
</select>
&nbsp;阶段：<select name="user.roles" >
	<option value="">请选择</option> 
    <option value="G1">G1</option>
	<option value="G2">G2</option>
	<option value="G3">G3</option> 
</select>
&nbsp;考试科目：<select name="user.roles" >
	<option value="">请选择</option> 
    <option value="JAVA">JAVA</option>
	<option value="PS">PS</option>
	<option value="HTML">HTML</option> 
	<option value="CSS">CSS</option> 
</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;考试类型：<select name="" >
	<option value="">请选择</option> 
    <option value="机试">机试</option>
	<option value="笔试">笔试</option>
</select>
&nbsp;状态：<select name="" >
	<option value="">请选择</option> 
    <option value="考试中">考试中</option>
	<option value="未开考">未开考</option>
	<option value="考试结束">考试结束</option> 
</select>
&nbsp;&nbsp;<s:submit value="查询" style="width:70px;height:25px;" />
</s:form><br>
&nbsp;<input type="button" onclick="random()" value="随机组卷">
&nbsp;<input type="button" value="选题组卷">
&nbsp;<input type="button" value="上机考试">
<br><br>
<table border="1" style="width: 1000px">
<tr bgcolor="#8A8A8A">
<td>序号</td>
<td>类别</td>
<td>科目</td>
<td>标题</td>
<td>考试时长(分钟)</td>
<td>操作</td>
</tr>
<s:iterator value="list" var="lis">
<tr>
<td><s:property value="#lis.pid" /></td>
<td><s:property value="#lis.ptype" /></td>
<td><s:property value="#lis.suname" /></td>
<td><s:property value="#lis.ptitle" /></td>
<td><s:property value="#lis.ptime" /></td>
<td>
<s:a href="javascript:revoke()">结束考试</s:a>  
<s:a href="#">查看成绩</s:a>
</td>
</tr>
</s:iterator>
</table>
</body>
</html>