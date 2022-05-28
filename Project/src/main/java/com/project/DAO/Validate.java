package com.project.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale.Category;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.project.bean.Teacher;

public class Validate {

	public static boolean validatelogin(String username, String password)
	{
		
		
		boolean result = false;
	
		
		result = username.equals(password);
		
		if(result)
		{
			return result;
		}
		else
		{
			return false;
		}
		
	}

	public static boolean validate_teacher(String t_name,String c_name,String s_name)
	{
		boolean result = false;
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		

		String sql1 ="from Teacher t where t_name ='"+t_name+"'";  
		Query query1 = s.createQuery(sql1);
		Iterator it1=query1.iterate();  
		while(it1.hasNext())
		{
			String sql2 ="from Classes c where classname ='"+c_name+"'";  
			Query query2 = s.createQuery(sql2);
			Iterator it2=query2.iterate();  
			while(it2.hasNext())
			{
				String sql3 ="from Subject s where sub_name ='"+s_name+"'"; 
				Query query3 = s.createQuery(sql3);
				Iterator it3=query3.iterate();  
				while(it3.hasNext())
				{
					result = true;
					break;
				}
				break;
				
		}
			break;
		}
		
		return result;
	}
	
	
	public static boolean validate_class(String cname)
	{
		boolean result=false;
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		String sql1 ="from Classes where classname= '"+cname+"'";  
		
		Query query = s.createQuery(sql1);
		Iterator it=query.iterate();  
		while(it.hasNext()) 
		{
			
			result= true;
			break;
		}
		if(result)
		{
			return result;
		}
		else
		{
			result=false;
			return result;
			
				}
		
		
		
	}
}
