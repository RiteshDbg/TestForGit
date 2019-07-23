package com.jspider.employee.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static SessionFactory factory=null;

	static{
			Configuration configuration=new Configuration();
			configuration.configure();
			factory=configuration.buildSessionFactory();
		}

	  	public static SessionFactory getSessionFactory()
	   {
	  	
		return factory;
	   }

		public HibernateUtils() {
			super();
			
		}

}
