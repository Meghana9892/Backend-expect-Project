<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class and Subject Details</title>
</head>
<body>
<h1>Add Class and Subject Details</h1>
<form action="<%=request.getContextPath()%>/classSubject" method="post">
Class Name: <input type="text" name="classname">
Subject1: <input type="text" name="sub1">
Subject2: <input type="text" name="sub2">
Subject3: <input type="text" name="sub3">
<input type="submit" value="Add"> 
<h1></h1>
<a href="home.jsp" style="text-align:center">BACK</a>
</body>
</html>