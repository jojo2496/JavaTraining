package com.JLTI.main;

import java.util.Scanner;

import com.JLTI.pojo.Current;
import com.JLTI.pojo.Savings;

public class AccountMainv6 {

	public static void main(String[] args) {
		
		int accountChoice;
		String salarychoice;
		boolean isSalary=false;
		int overdraftBalance;
		int choice;
		int amount;
		String continueChoice;
		
		Savings savings=new Savings();
		Current current=new Current();
		Scanner scanner=new Scanner(System.in);
		
		
		
		System.out.println("***********MENU***************");
		System.out.println("1.. savings account");
		System.out.println("2.. Current account");
		accountChoice=scanner.nextInt();
		
//		if(accountChoice==1) {
//			System.out.println("Do you want to open Salary account??");
//		}
		
		switch (accountChoice) {
		case 1:
			System.out.println("Do you want to open Salary account?? yes||no");
			salarychoice=scanner.next();
			if(salarychoice.equalsIgnoreCase("yes")){
				isSalary=true;
			}
			
			break;
		case 2:
			System.out.println("Enter overdraftBalance");
			overdraftBalance=scanner.nextInt();
			break;
			
			
		default:
			System.out.println("Sorry you have entered a wrong choice!");
			break;
		}
		
		
		
		System.out.println("*************MENU*************");
		
		do {
			System.out.println("Menu");
			System.out.println("1.. Withdraw");
			System.out.println("2.. Deposit");
			System.out.println("3.. Display Balance");

			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			if(accountChoice==1) {
			
				switch (choice) {
				case 1:
					System.out.println("Enter Amount");
					amount = scanner.nextInt();
					
					if (savings.Withdraw(amount))
						System.out.println("Transaction Success !!");
					else
						System.out.println("Transaction Failed !!");
					break;
				case 2:
					System.out.println("Enter Amount");
					amount = scanner.nextInt();
					if (savings.Deposit(amount))
						System.out.println("Transaction Success !!");
					else
						System.out.println("Transaction Failed !!");
					break;
				case 3:
					
					System.out.println("Balance :: " + savings.getBalance());
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
				System.out.println("Do you want to continue ? yes || no ");
				continueChoice = scanner.next();
			
			} 
			else {
				switch (choice) {
				case 1:
					System.out.println("Enter Amount");
					amount = scanner.nextInt();
					
					if (current.Withdraw(amount))
						System.out.println("Transaction Success !!");
					else
						System.out.println("Transaction Failed !!");
					break;
				case 2:
					System.out.println("Enter Amount");
					amount = scanner.nextInt();
					if (current.Deposit(amount))
						System.out.println("Transaction Success !!");
					else
						System.out.println("Transaction Failed !!");
					break;
				case 3:
					
					System.out.println("Balance :: " + current.getBalance());
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
				System.out.println("Do you want to continue ? yes || no ");
				continueChoice = scanner.next();
			
			} 
				
			
			
		}
		while (continueChoice.equalsIgnoreCase("yes"));
		}

			
		
	
		
		
		
			
		
		
		
		
		
	}

