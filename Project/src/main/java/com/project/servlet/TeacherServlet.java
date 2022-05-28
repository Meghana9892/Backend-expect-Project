package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.DAO.InsertDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String t_name = request.getParameter("tname");
		String t_email = request.getParameter("temail");
		String t_phone = request.getParameter("tphone");
		
		InsertDAO insertdao = new InsertDAO();
		boolean output = insertdao.addTeacher(t_name, t_email, t_phone);
		

		if(output)
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Teacher details Added succesfully!');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("teacher.jsp");
			rd.include(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Error! try again');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("teacher.jsp");
			rd.include(request, response);
		}
	}

}
