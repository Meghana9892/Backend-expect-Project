package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import com.project.DAO.InsertDAO;
import com.project.DAO.Validate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studentname= request.getParameter("studentname");
		String email= request.getParameter("email");
		String phone= request.getParameter("phone");
		String classes = request.getParameter("cls");
		
		boolean result = Validate.validate_class(classes);
		
		if(result)
		{
			
		InsertDAO dao = new InsertDAO();
		boolean output=dao.addStudent(studentname, email, phone,classes);
		
		if(output)
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Student Added succesfully!');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("student.jsp");
			rd.include(request, response);
		
		}

		}
		else
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Incorrect Class or Class not found. Please add class details');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("student.jsp");
			rd.include(request, response);
		}
	}

}
