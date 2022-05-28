package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.project.DAO.InsertDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		InsertDAO insertdao = new InsertDAO();
		boolean output = insertdao.addlogin(username, password);
		
		if(output)
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Login succesfully!');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.include(request, response);
		
		}

		else
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Incorrect Username or Password, Try Again!');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}

}
