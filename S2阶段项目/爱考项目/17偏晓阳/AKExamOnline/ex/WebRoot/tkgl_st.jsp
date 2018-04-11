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
table{border-right:1px solid #FFFFFF; border-bottom:1px solid #FFFFFF;}
.td1{color:"#ffffff";font-size:20px;}
td{border-left:1px solid #FFFFFF ; border-top:1px solid #FFFFFF; text-align:center;}
a{ text-decoration:none}
</style>
<script type="text/javascript">
 function add(){
  var iWidth=400;                          //弹出窗口的宽度; 
  var iHeight=520;                         //弹出窗口的高度; 
  var iTop = (window.screen.availHeight - 30 - iHeight) / 2; 
  var iLeft = (window.screen.availWidth - 10 - iWidth) / 2; 
  window.open('tkgl_add.jsp','teach', 'height=' + iHeight + ',,innerHeight=' + iHeight + ',width=' + iWidth + ',innerWidth=' + iWidth + ',top=' + iTop + ',left=' + iLeft + ',status=no,toolbar=no,menubar=no,location=no,resizable=no,scrollbars=0,titlebar=no'); 
 }
 
 function fun(id){
  var iWidth=400;                          //弹出窗口的宽度; 
  var iHeight=520;                         //弹出窗口的高度; 
  var iTop = (window.screen.availHeight - 30 - iHeight) / 2; 
  var iLeft = (window.screen.availWidth - 10 - iWidth) / 2; 
  window.open('/exam/tklogin!sel?que.qid='+id,'teach', 'height=' + iHeight + ',,innerHeight=' + iHeight + ',width=' + iWidth + ',innerWidth=' + iWidth + ',top=' + iTop + ',left=' + iLeft + ',status=no,toolbar=no,menubar=no,location=no,resizable=no,scrollbars=0,titlebar=no'); 
 }
</script>
<body>
<h3 align="center"><%=session.getAttribute("suName") %><%=session.getAttribute("stype") %>试题列表</h3>
<br>
<input type="button" value="添加试题" onclick="add()" />

<input type="file" value="选择文件" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="导入" />
<input type="button" value="下载考试试题模板" />
<br><br><br>
<s:form action="login!tosel" theme="simple">
<table border="0" cellspacing="0" cellpadding="0" bgcolor="#ebebdf" width="1000px">
<tr bgcolor=#8A8A8A>
<td class="td1">序号</td>
<td class="td1">类型</td>
<td class="td1">题目内容</td>
<td class="td1">选项A</td>
<td class="td1">选项B</td>
<td class="td1">选项C</td>
<td class="td1">选项D</td>
<td class="td1">难度</td>
<td class="td1">对应章节</td>
<td class="td1">答案</td>
<td class="td1">操作</td>
</tr>
<s:iterator value="list" var="lis">
<tr>
<td><s:property value="#lis.qid" /></td>
<td><s:property value="#lis.type" /></td>
<td><s:property value="#lis.content" /></td>
<td><s:property value="#lis.optionA" /></td>
<td><s:property value="#lis.optionB" /></td>
<td><s:property value="#lis.optionC" /></td>
<td><s:property value="#lis.optionD" /></td>
<td><s:property value="#lis.hard" /></td>
<td><s:property value="#lis.charpter" /></td>
<td><s:property value="#lis.answer" /></td>
<td>
<s:a href="javascript:fun(%{#lis.qid});">编辑</s:a>   
<s:a href="/exam/tklogin!tkdel?que.qid=%{#lis.qid}">删除</s:a>
</td>
</tr>
</s:iterator>
</table>
</s:form>
</body>
</html>