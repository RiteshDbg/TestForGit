package com.jspider.employee.dto;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
	@Id
	@GeneratedValue(generator="inc")
	@GenericGenerator(name="inc",strategy="increment")
	private int employeeId;
	private String employeeName; 
	private int contactNum;
	private String mailId;
	private String Address;
	private String designation;
	private int salary;
	private String bloodGroup;
	
	@OneToMany(mappedBy="employee")
	List<Laptop> laptop;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
       
	public int getContactNum() {
		return contactNum;
	}

	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}
	
	

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	

	public Employee() {
		super();
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", contactNum=" + contactNum
				+ ", mailId=" + mailId + ", Address=" + Address + ", designation=" + designation + ", salary=" + salary
				+ ", bloodGroup=" + bloodGroup + ", laptop=" + laptop + "]";
	}

	
	
	

}
