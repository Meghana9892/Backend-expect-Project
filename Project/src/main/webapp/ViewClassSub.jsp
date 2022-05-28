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
<title>Class and Subjects</title>
</head>
<body>
<h1>Class and Subjects</h1>
<table width="220" border="1">  
<tr><th>Subject ID</th><th>Subject</th></tr>        
<%

Configuration cfg = new Configuration().configure();
SessionFactory factory = cfg.buildSessionFactory();
Session s = factory.openSession();
Transaction tx = s.beginTransaction();

String sql1 = "from Subject";
Query query = s.createQuery(sql1);
Iterator it = query.iterate();
while(it.hasNext())
{
	Subject sub=(Subject)it.next();
	out.println("<tr><td>"+sub.getSub_id()+"</td>"+"<td>"+sub.getSub_name()+"</td></tr>");
	}
								
%>
</table>
<h1></h1>
<table width="220" border="1">  
<tr><th>Class ID</th><th>Class</th></tr>        
<%


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
</body>
</html>