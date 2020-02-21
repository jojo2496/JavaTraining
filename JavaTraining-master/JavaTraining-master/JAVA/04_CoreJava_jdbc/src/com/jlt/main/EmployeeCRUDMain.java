package com.jlt.main;

import java.util.Scanner;

import com.jlt.DAO.EmployeeDAO;
import com.jlt.pojo.Employee;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int employeeid;
		String name;
		double salary;
		int choice;
		String continueChoice="";
		
		Scanner scanner=new Scanner(System.in);
		
		EmployeeDAO employeeDAO=new EmployeeDAO();
		
		
		
		do {
			System.out.println("1..Add new employee");
			System.out.println("Enter a choice..");
			choice=scanner.nextInt();
			
			switch (choice) {
			case 1: {
				
				System.out.println("enter employeeid:: ");
				employeeid=scanner.nextInt();
				System.out.println("enter name:: ");
				name=scanner.next();
				System.out.println("enter salary:: ");
				salary=scanner.nextDouble();
				
				Employee employee=new Employee(employeeid,name,salary);
				
				if(employeeDAO.addemployee(employee)) {
					System.out.println("employee added successfully...");
				}
				else
					System.out.println("Failed to add...");
				break;
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
			
			
			
			System.out.println("Do you want to continue?? ");
			continueChoice=scanner.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
		
		
		
		
		
		

	}

}
