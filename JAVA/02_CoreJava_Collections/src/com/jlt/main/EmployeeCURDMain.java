package com.jlt.main;

import java.util.List;
import java.util.Scanner;

import com.jlt.dao.EmployeeDAO;
import com.jlt.pojo.Employee;

public class EmployeeCURDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		int employeeId;
		String name;
		double salary;
		int i = 0;

		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter Employee ID:: ");
			employeeId = scanner.nextInt();
			System.out.println("Enter Employee Name:: ");
			name = scanner.next();
			System.out.println("Enter Employee Salary:: ");
			salary = scanner.nextInt();

			Employee employee = new Employee(employeeId, name, salary);
			System.out.println(employee);

			if (dao.addEmployee(employee)) {
				System.out.println("Employee added successfully..");
			} else
				System.out.println("Failed to add employee...");
			i++;
		} while (i < 3);

		List<Employee> emp = dao.getAllEmployees();
		for (Employee employee : emp) {
			System.out.println(employee);
		}

		System.out.println("*********************LIST OF ALL EMPLOYEES************************");

		for (Employee singleemp : emp) {
			System.out.println(singleemp);
		}

		System.out.println("Enter EmployeeId: ");
		employeeId = scanner.nextInt();
		Employee employee = dao.getEmployeeByEmployeeId(employeeId);
		if (employee != null)
			System.out.println(employee);
		else
			System.out.println("No employee found...");

		System.out.println("*******************UPDATE EMP**************************");

		System.out.println("Update Employee Salary...");
		
		System.out.println("Enter Employee id:: ");
		employeeId=scanner.nextInt();
		System.out.println("Enter Salary:: ");
		salary=scanner.nextDouble();
		if(dao.updateEmployeeSalary(employeeId, salary)) {
			System.out.println("Salary updated successfully...");
		}
		else
			System.out.println("Salary update failed...");
		
		System.out.println("Display all records..");
		emp=dao.getAllEmployees();
		for(Employee display:emp) {
			System.out.println(display);
		}
		
		
		System.out.println("*******************DELETE EMP**************************");
		
		System.out.println("Please enter Employee Id:: ");
		employeeId=scanner.nextInt();
		
		if(dao.deleteEmployee(employeeId)) {
			System.out.println("Employee deleted successfully....");
		}
		else
			System.out.println("Sorry not successful...");

	}

}
