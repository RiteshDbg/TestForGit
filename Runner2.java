package com.jspider.employee.dao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.jspider.employee.dto.Employee;
import com.jspider.employee.dto.Laptop;

public class Runner2 {
	public static void main(String[] args) 
	{
		
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee mohan=new Employee();
	    mohan.setEmployeeId(101);
	    mohan.setEmployeeName("Mohan");
	    mohan.setContactNum(123456789);
	    mohan.setAddress("Delhi");
	    mohan.setDesignation("Engineer");
	    mohan.setSalary(40000);
	    mohan.setBloodGroup("O+");
	    
	    
	    Employee abhi=new Employee();
	    abhi.setEmployeeId(102);
	    abhi.setEmployeeName("Abhi");
	    abhi.setContactNum(326542390);
	    abhi.setAddress("Punjab");
	    abhi.setDesignation("Doctor");
	    abhi.setSalary(800000);
	    abhi.setBloodGroup("A-");
	    
	    
	    Laptop appleMacAir=new Laptop();
		appleMacAir.setBrand("Apple ");
		appleMacAir.setModel("MacAirBook");
		appleMacAir.setPrice(100000);
		

	    Laptop lenovo=new Laptop();
		lenovo.setBrand("Lenovo ");
		lenovo.setModel("G440s");
		lenovo.setPrice(50000);
		
		
	    Laptop hp=new Laptop();
		lenovo.setBrand("Hp ");
		lenovo.setModel("G400");
		lenovo.setPrice(45000);
		
		List<Laptop> laptopofMohan= new ArrayList<Laptop>();
		laptopofMohan.add(appleMacAir);
		laptopofMohan.add(lenovo);
		mohan.setLaptop(laptopofMohan);
		
		List<Laptop> laptopofAbhi= new ArrayList<Laptop>();
		laptopofAbhi.add(hp);
		abhi.setLaptop(laptopofAbhi);
		
		
		session.save(appleMacAir);
		session.save(lenovo);
		session.save(hp);
		session.save(mohan);
		session.save(abhi);
		
		transaction.commit();
		factory.close();
		session.close();
		
		
		
	}

}
