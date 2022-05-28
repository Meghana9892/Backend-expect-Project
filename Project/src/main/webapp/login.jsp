<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ILogin</title>
</head>
<style>
h1 {text-align: center;}
h4{text-align: center;}
div {text-align: center;}
</style>
<body>
<h1>Welcome to Learner’s Academy</h1>
<h4>Admin Login</h4>
<form action="<%=request.getContextPath()%>/login" method="post">
Username <input type="text" name="username">
Password <input type="password" name="password">
<h1></h1>
<input type="submit" value="LOGIN">

</form>
</body>
</html>