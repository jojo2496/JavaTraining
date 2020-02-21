package com.jlt.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;





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


	public int getEmployeeid() {
		return employeeid;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
public void addEmployee() {
		
		String sql_insert="insert into employee_master values (?,?,?)";
		
	String url="jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true;";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Driver loaded..");
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection Established...You are good to go.");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PreparedStatement insert=.prepareStatement(sql_insert);
		insert.setInt(employeeid);
		insert.setString(2,"Saurabh Joshi");
		insert.setFloat(3,(float)1000.50);
		
		int rowcount=insert.executeUpdate();
		System.out.println(rowcount+" record inserted!");
		
		
		
		
			
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
