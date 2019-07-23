package com.jspider.employee.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jspider.employee.dao.HibernateUtils;
import com.jspider.employee.dto.Employee;

public class Runner3 {
	public static void main(String[] args)
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		System.out.println(session.get(Employee.class,1));
		
		
		
	}


}
