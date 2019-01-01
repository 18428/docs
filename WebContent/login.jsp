<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login Page</title>
	<%@ include file="head.jsp" %>
</head>
<body>
	<form  class="layui-form" action="LoginServlet" method="post">
		<h1>docs login</h1> <br>
		用户名：<input type="text" name="userName"/> <br>
		密码：<input type="password" name="password"/>
		<input type="submit" value="login"/>
	</form>
	<p>Basic Buttons</p>
    <div style="padding:5px 0;">
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">Add</a>
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">Remove</a>
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">Save</a>
        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cut',disabled:true">Cut</a>
        <a href="#" class="easyui-linkbutton">Text Button</a>
    </div>
</body>
</html>