<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.hibernate.*,java.util.* ,java.sql.*"%>
<%@page import= "org.hibernate.cfg.Configuration" %>
<%@page import= "com.project.bean.*" %>
<%@page import="com.project.servlet.*,javax.persistence.EntityManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class report</title>
</head>
<body>
<h1>Class report</h1>
<table width="220" border="1">  
<tr><th>Student Name</th><th>Class</th><th>Subject</th><th>Teacher Name</th></tr>       
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
	Class.forName("com.mysql.cj.jdbc.Driver");	
	Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root","Megna@9797");
	
	Student stu=(Student)it.next();
	out.println("<tr><td>"+stu.getStudentname()+"</td>");
	String cname = stu.getClasses();
	String sql2 = "from Classes c where classname ='"+cname+"'";
	Query query2 = s.createQuery(sql2);
	Iterator it2 = query2.iterate();
	while(it2.hasNext())
	{	
		Classes c = (Classes)it2.next();
		out.println("<td>"+c.getClassname()+"</td>");
    	int id = c.getClassid();
    	List<String> subjects = new ArrayList<String>();
				
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select *  from subjects where classid='"+id+"'");
		while(rs.next())
		{
			String subname = rs.getString("Sub_name");
			subjects.add(subname);
		}
	
			out.println("<td>"+subjects+"</td>");
		
			
		}
	List<String> tname = new ArrayList<String>();
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from teach_sub_class where cname='"+cname+"'");
	while(rs.next())
	{
		String teachername = rs.getString("tname");
		tname.add(teachername);
	}
		
		out.println("<td>"+tname+"</td></tr>");
	
		
	}
	
								
%>

<h4></h4>
<a href="home.jsp" style="text-align:center">BACK</a>
</table>
</body>
</html>