<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
 <script type="text/javascript">
  function fun(){ 
  $.ajax({
  type:"post",
  async:true, 
  url:"",
  date:$("#f1").serialize(),
  success:function(){
  alert("修改成功");
  window.close();
  }
  });
  }
  </script>
  
 <style type="text/css">
  #d1{
  position:relative;
  top:40px;
  }
  #zb{
  text-align:right;
  font-size: 15;
  }
  table{
  margin: 0 auto;
  }
  td{
  width:300px;
  height:60px;
  }
  </style>
  </head>
  <body>
   <div id="d1">
   <s:form action="tklogin!tkupd" method="post" theme="simple" id="f1">
   <table>
   <s:hidden name="que.qid" />
   <tr>
   <td id="zb">科目名称：</td>      
 <!--  <td><input type="text" value="<%=session.getAttribute("suName") %>" disabled="disabled" /></td> --> 
   <td><s:textfield value="%{#session.suName}" disabled="true" /></td>
   </tr> 
     
   <tr>
   <td id="zb">类型：</td>
   <td><s:select list="{' ','单选','多选'}" name="que.type" value="%{toque.type}" /></td>
   </tr>
   
   <tr>
   <td id="zb">题目内容：</td>
   <td><s:textarea name="que.content" value="%{toque.content}" /></td>
   </tr>
  
   <tr>
      <td id="zb">选项：</td>
      <td>
      <s:checkbox name="que.answer" fieldValue="A" /> <s:textfield name="que.optionA" value="%{toque.optionA}" /><br>
      <s:checkbox name="que.answer" fieldValue="B" /><s:textfield name="que.optionB" value="%{toque.optionB}" /><br>
      <s:checkbox name="que.answer" fieldValue="C" /><s:textfield name="que.optionC" value="%{toque.optionC}" /><br>
      <s:checkbox name="que.answer" fieldValue="D" /><s:textfield name="que.optionD" value="%{toque.optionD}" /><br>
      </td>
   </tr>
   
   <tr>
   <td id="zb">难度：</td>
   <td><s:select list="{' ','简单','困难'}" name="que.hard" value="%{toque.hard}" /></td>
   </tr>
   
   <tr>
   <td id="zb">对应章节：</td>
   <td><s:textfield name="que.charpter" value="%{toque.charpter}" /></td>
   </tr>
   
   <tr>
   <td colspan="2" align="center">
   <s:submit value="修改" onclick="fun()" style="width:70px;height:30px"  />
   &nbsp;<input type="button" value="重置" id="qx" style="width:70px;height:30px" />
   </td>
   </tr>
   </table>
   </s:form>
   </div>
  </body>
</html>
