package com.jlt.dao;

import java.util.ArrayList;
import java.util.List;

import com.jlt.pojo.Employee;

public class EmployeeDAO {

	private List<Employee> employeelist = new ArrayList<Employee>();

	public boolean addEmployee(Employee employee) {

		System.out.println("In EmployeeDao :: addEmployee");

		if (employee != null) {
			employeelist.add(employee);

			return true;
		}

		return false;
	}

	public List<Employee> getAllEmployees() {
		return employeelist;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {

		for (Employee emp : employeelist) {
			if (emp.getEmployeeId() == employeeId) {
				return emp;
			}

		}
		return null;
	}

	public boolean updateEmployeeSalary(int employeeId, double newSalary) {

		for (Employee emp : employeelist) {
			if (emp.getEmployeeId() == employeeId) {
				emp.setSalary(newSalary);

			}
		}

		return false;

	}
	
	public boolean deleteEmployee(int employeeId) {

		for (Employee emp : employeelist) {
			if (emp.getEmployeeId() == employeeId) {
				employeelist.remove(emp);

			}
		}

		return false;

	}
	
	
	
	
	
}
