package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.project.DAO.InsertDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ClassSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String classname = request.getParameter("classname");
		String sub1 = request.getParameter("sub1");
		String sub2 = request.getParameter("sub2");
		String sub3 = request.getParameter("sub3");
		
		InsertDAO insertdao = new InsertDAO();
		boolean output = insertdao.add_class_subject(sub1, sub2, sub3, classname);
		
		if(output)
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Class Added succesfully!');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("class-subject.jsp");
			rd.include(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Error! try again');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("class-subject.jsp");
			rd.include(request, response);
		}
	}

}
