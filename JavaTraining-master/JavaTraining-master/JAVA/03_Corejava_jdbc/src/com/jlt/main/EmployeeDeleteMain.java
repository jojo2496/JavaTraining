package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDeleteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql_delete="Delete from employee_master where employee_id=?";
		String url="jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true;";
		String sql_select="Select * from employee_master";
		
		
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection connection=DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql_delete);
			preparedStatement.setInt(1, 101);
			preparedStatement.executeUpdate();
			System.out.println("Record deleted successfully...");
			connection.prepareStatement(sql_select);
			ResultSet resultSet=preparedStatement.executeQuery();

			System.out.println("Employee id \t Name \t\t\t Salary");
			while(resultSet.next()) {
				
				System.out.print( resultSet.getInt("employee_id"));
				System.out.print("\t\t"+resultSet.getString("name"));
			System.out.print("\t\t"+resultSet.getFloat("salary"));	
			System.out.println();
			
			}
			
			connection.close();
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
