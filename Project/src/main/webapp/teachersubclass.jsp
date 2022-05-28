<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.hibernate.criterion.Restrictions" %>
<%@page import="org.hibernate.*,java.util.* ,java.sql.*"%>
<%@page import= "org.hibernate.cfg.Configuration" %>
<%@page import= "com.project.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Assign Teacher to Subject</title>
</head>
<body>
<h1>Assign Teacher to Subject</h1>

<form action="<%=request.getContextPath()%>/teacherSubClass" method="post">
Enter Teacher name
 <input type="text" name="tname">
 Class:
 <input type="text" name="cname">
 Subject:
 <input type="text" name="sname">
 
<input type="submit" value="Add">
<h4>Refer List of Classes and Subjects    </h4>
<h4></h4>
<h4>Assigned List</h4>
<table width="220" border="1">  
<tr><th>Teacher Name</th><th>Class</th><th>Subject</th></tr>    

<%

Configuration cfg = new Configuration().configure();
SessionFactory factory = cfg.buildSessionFactory();
Session s = factory.openSession();
Transaction tx = s.beginTransaction();

String sql1 = "from TeacherSubjectClass";
Query query = s.createQuery(sql1);
Iterator it = query.iterate();
while(it.hasNext())
{
	TeacherSubjectClass tsc=(TeacherSubjectClass)it.next();
	out.println("<tr><td>"+tsc.getTname()+"</td><td>"+tsc.getCname()+"</td><td>"+tsc.getSname()+"</td></tr>");
	}

%>

</table>

<h4></h4>
<a href="home.jsp">BACK</a>
</form>
</body>
</html>