<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.hibernate.*,java.util.* "%>
<%@page import= "org.hibernate.cfg.Configuration" %>
<%@page import= "com.project.bean.*" %>
<%@page import="com.project.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student details</title>
</head>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>
<h1>Add Student Details</h1>
<form action="<%=request.getContextPath()%>/student" method="post">
Student Name: <input type="text" name="studentname">
Email: <input type="email" name="email">
Phone: <input type="text" name="phone">
Class: <input type="text" name="cls">
<input type="submit" value="Save">
<h4>Kindly select the class from the below table</h4>
<table width="220" border="1">  
<tr><th>Class ID</th><th>Class</th></tr>        
<%

Configuration cfg = new Configuration().configure();
SessionFactory factory = cfg.buildSessionFactory();
Session s = factory.openSession();
Transaction tx = s.beginTransaction();

String sql2 = "from Classes";
Query query2 = s.createQuery(sql2);
Iterator it2 = query2.iterate();
while(it2.hasNext())
{
	Classes classes=(Classes)it2.next();
	out.println("<tr><td>"+classes.getClassid()+"</td>"+"<td>"+classes.getClassname()+"</td></tr>");
	}
	s.close();									
%>
</table>   
<h4></h4>
<a href="home.jsp" style="text-align:center">BACK</a>
</form>
</body>
</html>