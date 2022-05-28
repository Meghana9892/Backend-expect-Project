package com.project.DAO;

import java.net.http.HttpClient.Redirect;
import java.util.*;


import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.bean.*;



public class InsertDAO {
	
	
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	
		public boolean addlogin(String username, String password)
		{	
			boolean output = false;
			
			output = Validate.validatelogin(username, password);
			System.out.println(output);
			if(output)
			{
				Loginclass login = new Loginclass(username,password);
				session.save(login);
				tx.commit();
				session.close();
				output = true;
			}
			else
			{
				output = false;
			}
			return output;
		}

	public boolean addStudent(String studentname,String email,String phone,String classes)
	{
		boolean result=false;
		while(result==false)
		{
		Student student = new Student(studentname,email,phone,classes);
		session.save(student);
		tx.commit();
		result=true;
		session.close();
		break;
		}
		return result;
			
	}
	
	public boolean addTeacher(String tname,String temail,String tphone)
	{
		boolean result = false;
		while(result==false)
		{
		Teacher teacher = new Teacher(tname,temail,tphone);
		session.save(teacher);
		tx.commit();
		session.close();
		result=true;
		break;
		}
		return result;
	}
	
	public boolean add_class_subject(String sub1, String sub2, String sub3, String classname)
	{
		boolean result = false;
		while(result==false)
		{
		Subject s1 = new Subject(sub1);
		session.save(s1);
		Subject s2 = new Subject(sub2);
		session.save(s2);
		Subject s3 = new Subject(sub3);
		session.save(s3);
		
		Set<Subject> subjects = new HashSet<Subject>();
		subjects.add(s1);
		subjects.add(s2);
		subjects.add(s3);
		
		
		Classes classes = new Classes(classname);
		classes.setSubjects(subjects);
		session.save(classes);
		tx.commit();
		result=true;
		session.close();
		break;
		}
		return result;
	}
	
	public boolean add_t_c_s(String tname, String cname,String sname)
	{
		boolean result=false;
		while(result==false)
		{
		TeacherSubjectClass tsc= new TeacherSubjectClass(tname,cname,sname);
		session.save(tsc);
		tx.commit();
		result=true;
		session.close();
		break;
		}
		return result;
	}
}
