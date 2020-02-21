package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeselectMain {

	public static void main(String[] args) {
		
		String url="jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true;";
		String sql_select="Select * from employee_master;";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Connection Established..");
			
			Connection connection=DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql_select);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println("Employee id \t Name \t\t\t Salary");
			while(resultSet.next()) {
				
				System.out.print( resultSet.getInt("employee_id"));
				System.out.print("\t\t"+resultSet.getString("name"));
			System.out.print("\t\t"+resultSet.getFloat("salary"));	
			System.out.println();
			
			}
			
			
			
			connection.close();
			System.out.println("Connection closed...");
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Sorry something went wrong!"+e.getMessage());
			e.printStackTrace();
		}
		
		
		
		

	}

}
