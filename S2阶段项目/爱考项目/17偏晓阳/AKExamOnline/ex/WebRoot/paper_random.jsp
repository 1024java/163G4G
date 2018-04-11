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
 window.close();
 }
  var fun=function(){
  var n1=parseInt(f1.n1.value);
  var n2=parseInt(f1.n2.value);
  var n3=parseInt(f1.n3.value);
  var n4=parseInt(f1.n4.value);
  var n5=parseInt(f1.n5.value);
  var n6=parseInt(f1.n6.value);
  var v=parseInt(n1+n2+n3+n4+n5+n6);
  return v;
};
  
  var gan=function(){
  
  fun();
  }
</script>
<body>
<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;方向：<select name="user.role" >
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
&nbsp;科目：<select name="user.roless" >
	<option value="">请选择</option> 
    <option value="JAVA">JAVA</option>
	<option value="PS">PS</option>
	<option value="HTML">HTML</option> 
	<option value="CSS">CSS</option> 
</select><br><br>
<s:form action="sjlogin!randomAdd" theme="simple" name="f1">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;标题：<s:textfield name="pap.ptitle" size="44" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总分：<s:textfield name="pap.ptotal" size="25" />分<br><br>
&nbsp;&nbsp;&nbsp;考试时长：<s:textfield name="pap.ptime" size="25" />分钟<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;单选题：简单 <input type="text" name="n1" size="1" /> 一般 <input type="text" name="n2" size="1" /> 困难 <input type="text" name="n3" size="1" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;多选题：简单 <input type="text" name="n4" size="1" /> 一般 <input type="text" name="n5" size="1" /> 困难 <input type="text" name="n6" size="1" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总题数：<s:textfield name="pap.ptotalNum" size="1" />&nbsp;&nbsp;每题分数：<s:textfield name="pap.pone" size="1" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;试题类型：<s:select list="{' ','机试','笔试'}" name="pap.ptype" /><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<s:submit value="创建试卷" style="width:70px;height:30px" />&nbsp;
<input type="button" value="取消" onclick="revoke()" style="width:70px;height:30px" />
</s:form>
</body>
</html>