<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.hibernate.criterion.Restrictions" %>
<%@page import="org.hibernate.*,java.util.* "%>
<%@page import= "org.hibernate.cfg.Configuration" %>
<%@page import= "com.project.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher Details</title>
</head>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>
<h1>Add Teacher Details</h1>
<form action="<%=request.getContextPath()%>/teacher" method="post">
Name: <input type="text" name="tname">
Email: <input type="text" name="temail">
Phone: <input type="text" name="tphone">
<input type="submit" value="Add">

</form>
<h1></h1>
<a href="home.jsp" style="text-align:center">BACK</a>
</body>
</html>