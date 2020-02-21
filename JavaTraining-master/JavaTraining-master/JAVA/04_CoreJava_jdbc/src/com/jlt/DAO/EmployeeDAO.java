package com.jlt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jlt.factory.ConnectionFactory;
import com.jlt.pojo.Employee;

public class EmployeeDAO {

	private ConnectionFactory factory;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private int rowCount;

	private String SQL_INSERT_EMPLOYEE = "insert into employee_master values(?,?,?)";

	public boolean addemployee(Employee employee) {

		try {
			connection = new ConnectionFactory().getDBConnection();

			preparedStatement = connection.prepareStatement(SQL_INSERT_EMPLOYEE);
			
			
			
			preparedStatement.setInt(1,employee.getEmployeeid());
			preparedStatement.setString(2,employee.getName());
			preparedStatement.setDouble(3,employee.getSalary());
			
			rowCount=preparedStatement.executeUpdate();
			connection.close();
			if(rowCount>0) {
				return true;
				
			}
			else 
				return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		return false;
	}

}
