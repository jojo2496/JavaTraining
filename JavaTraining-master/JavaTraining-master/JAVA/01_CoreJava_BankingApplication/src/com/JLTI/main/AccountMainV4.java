package com.JLTI.main;

import java.util.Scanner;

import com.JLTI.pojo.Account;
import com.JLTI.pojo.Savings;

public class AccountMainV4 {

	public static void main(String[] args) {
		String name;
		double balance;
		int choice;
		int amount;
		String continueChoice;
		int type;
		boolean isSalary = false;

		Scanner scanner = new Scanner(System.in);
		Account account;

//		Savings savings = new Savings("Vivek Gohil", 10000, true);
//		System.out.println(savings);

		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		System.out.println("Type :: Press 1 for Salary and Press 2 for Savings");
		type = scanner.nextInt();
		if (type == 1)
			isSalary = true;

		account = new Savings(name, balance, isSalary);

		System.out.println("Accout Created Successfully");
		System.out.println(account);
		do {
			System.out.println("Menu");
			System.out.println("1.. Withdraw");
			System.out.println("2.. Deposit");
			System.out.println("3.. Display Balance");

			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Amount");
				amount = scanner.nextInt();
				if (account.Withdraw(amount))
					System.out.println("Transaction Success !!");
				else
					System.out.println("Transaction Failed !!");
				break;
			case 2:
				System.out.println("Enter Amount");
				amount = scanner.nextInt();
				if (account.Deposit(amount))
					System.out.println("Transaction Success !!");
				else
					System.out.println("Transaction Failed !!");
				break;
			case 3:
				System.out.println("Balance :: " + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue ? yes || no ");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
	}
}
