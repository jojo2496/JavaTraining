package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connectionMain {

	public static void main(String[] args) {
		
		String url="jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true;";
		//String url1="jdbc:sqlserver://EVISION-09\\SQLEXPRESS:1433;databaseName=employeedb;integratedSecurity=true;";
		//String url2="jdbc:sqlserver://SQLEXPRESS\localhost:1433;databaseName=employeedb;integratedSecurity=true;]";
		//String url3="jdbc:sqlserver://localhost;integratedSecurity=true";
		//String user="";
		//String password="";
		String sql_insert="insert into employee_master values (?,?,?)";
		

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Driver Loaded successfully...");
			Connection con=DriverManager.getConnection(url);
			//Connection connection=DriverManager.getConnection(url,user,password);
			System.out.println("connection success...");
			
			PreparedStatement insert=con.prepareStatement(sql_insert);
			insert.setInt(1,101);
			insert.setString(2,"Saurabh Joshi");
			insert.setFloat(3,(float)1000.50);
			
			int rowcount=insert.executeUpdate();
			System.out.println(rowcount+" record inserted!");
			
			
			
			
			con.close();
			System.out.println("Connection closed....");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception:: "+e.getMessage());

			e.printStackTrace();
		}

	}

}
