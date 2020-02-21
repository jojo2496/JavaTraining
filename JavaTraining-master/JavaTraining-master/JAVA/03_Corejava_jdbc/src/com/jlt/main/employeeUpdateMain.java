package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class employeeUpdateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true;";
		String sql_update="Update employee_master set salary=? where employee_id =?";
		
		
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Connection Establised");
			
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(sql_update);
			preparedStatement.setFloat(1,(float)5000.45);
			preparedStatement.setInt(2,101);
			
			int rowCount=preparedStatement.executeUpdate();
			System.out.println("Record updated successfully..."+rowCount);
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
