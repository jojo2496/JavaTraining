package com.jlt.pojo;

public class Employee {

	private int employeeid;
	private String name;
	private double salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int employeeid, String name, double salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.salary = salary;
	}


	public int getEmployeeid() {
		return employeeid;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
