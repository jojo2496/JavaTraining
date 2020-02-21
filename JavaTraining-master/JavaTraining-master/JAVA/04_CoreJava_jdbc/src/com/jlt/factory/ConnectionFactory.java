package com.jlt.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	//private String url="jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true;";
	private Connection connection;
	
	
	public Connection getDBConnection() {
		
String url="jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true;";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Driver loaded..");
			connection=DriverManager.getConnection(url);
			System.out.println("Connection Established...You are good to go.");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error occured...");
			e.printStackTrace();
		}
		
		
		return null;
	}
	

}
