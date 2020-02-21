package com.jlt.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jlt.main.connectionMain;

public class EmployeeDatabase {
	
	int employeeid;
	String name;
	double salary;
	
	
	public String getConnection() {
		
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
			
	}
	
	
	public boolean addEmployee(Employee employee) {
		
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
		
		
		
		
		
		
		//PreparedStatement insert=employee.addEmployee();
		
		
		int rowcount=insert.executeUpdate();
		System.out.println(rowcount+" record inserted!");
		
		
		
		
		
		
		
		
		
	
			
	}
	public boolean displayEmployee(Employee employee) {
		
		getConnection();
		String sql_select="Select * from employee_master;";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Connection Established..");
			
			Connection connection=DriverManager.getConnection(getConnection());
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql_select);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println("Employee id \t Name \t\t\t Salary");
			while(resultSet.next()) {
				
				System.out.print( resultSet.getInt("employee_id"));
				System.out.print("\t\t"+resultSet.getString("name"));
			System.out.print("\t\t"+resultSet.getFloat("salary"));	
			System.out.println();
			return true;
			
			}
			

		
		
		
		
		return false;
	}
	

}
