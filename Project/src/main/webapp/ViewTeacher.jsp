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
<title>Teacher Details</title>
</head>
<body>
<h1>Teacher Details</h1>
<table width="220" border="1">  
<tr><th>Teacher ID</th><th>Teacher Name</th><th>Teacher Email</th><th>Teacher phone</th></tr>        
<%

Configuration cfg = new Configuration().configure();
SessionFactory factory = cfg.buildSessionFactory();
Session s = factory.openSession();
Transaction tx = s.beginTransaction();

String sql1 = "from Teacher";
Query query = s.createQuery(sql1);
Iterator it = query.iterate();
while(it.hasNext())
{
	Teacher t =(Teacher)it.next();
	out.println("<tr><td>"+t.getT_id()+"</td><td>"+t.getT_name()+"</td><td>"+t.getT_email()+"</td><td>"+t.getT_phone()+"</td></tr>");
	}
								
%>
</table>
<h4></h4>
<a href="home.jsp" style="text-align:center">BACK</a>
</body>
</html>