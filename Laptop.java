package com.jspider.employee.dto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(generator="inc")
	@GenericGenerator(name="inc", strategy="increment")
	private String model;
	private String brand;
	private float price;
	
	@ManyToOne()
	private Employee employee;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", brand=" + brand + ", price=" + price + ", employee=" + employee + "]";
	}


	
	
	

}
