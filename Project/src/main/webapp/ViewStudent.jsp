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
<title>Student Details</title>
</head>
<body>
<h1>Student Details</h1>
<table width="220" border="1">  
<tr><th>Student ID</th><th>Student Name</th><th>Student Email </th><th>Student Phone </th><th>Class</th></tr>        
<%

Configuration cfg = new Configuration().configure();
SessionFactory factory = cfg.buildSessionFactory();
Session s = factory.openSession();
Transaction tx = s.beginTransaction();

String sql1 = "from Student";
Query query = s.createQuery(sql1);
Iterator it = query.iterate();
while(it.hasNext())
{
	Student stu=(Student)it.next();
	out.println("<tr><td>"+stu.getId()+"</td><td>"
	+stu.getStudentname()+"</td><td>"+stu.getEmail()+"</td><td>"
			+stu.getPhone()+"</td><td>"+stu.getClasses()+"</td></tr>");
}

								
%>

</table>
<h4></h4>
<a href="home.jsp" style="text-align:center">BACK</a>
</body>
</html>