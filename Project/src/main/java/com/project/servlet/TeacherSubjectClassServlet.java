package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.project.DAO.InsertDAO;
import com.project.DAO.Validate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TeacherSubjectClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tname = request.getParameter("tname");
		String cname =  request.getParameter("cname");
		String sname = request.getParameter("sname");
		
		boolean output1 = Validate.validate_teacher(tname,cname,sname);
		if(output1)
		{
			InsertDAO insertdao = new InsertDAO();
			boolean output2 = insertdao.add_t_c_s(tname, cname, sname);
			
			if(output2)
			{
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Teacher assigned to class!');");
				pw.println("</script>");
				RequestDispatcher rd=request.getRequestDispatcher("teachersubclass.jsp");
				rd.include(request, response);
			}
			else
			{
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Error! try again');");
				pw.println("</script>");
				RequestDispatcher rd=request.getRequestDispatcher("teachersubclass.jsp");
				rd.include(request, response);
			}
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Incorrect Teacher or Class or Subject');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("teachersubclass.jsp");
			rd.include(request, response);
		}
	}

}
