package com.JLTI.main;

import java.util.Scanner;

import com.JLTI.pojo.Account;

public class AccountMainv2 {

	public static void main(String[] args) {

		int accountNumber;
		String name;
		double balance;
		int amount;
		int choice;
		String continueChoice;

		Scanner sc = new Scanner(System.in);
		Account account = null;

		System.out.println("Enter Account Number: ");
		accountNumber = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Balance: ");
		balance = sc.nextDouble();

		account = new Account(accountNumber, name, balance);

		System.out.println("Account Created successfully!!!");
		System.out.println(account);
do {
		System.out.println("Menu");
		System.out.println("************************************************");
		System.out.println("1..Withdraw");
		System.out.println("2..Deposit");
		System.out.println("3..Display Balance");
		System.out.println("Enter your choice..");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter Amount...");
			amount = sc.nextInt();
			if (account.Withdraw(amount))
				System.out.println("Transaction Success !!");
			else
				System.out.println("Transaction Failed !!");
			break;

		case 2:
			System.out.println("Enter Amount...");
			amount = sc.nextInt();
			if (account.Withdraw(amount))
				System.out.println("Transaction Success !!");
			else
				System.out.println("Transaction Failed !!");
			break;

		case 3:
			System.out.println("Balance:: " + account.getBalance());

			break;

		default:
			System.out.println("Invalid Choice!!!");
			break;
		}
		
		System.out.println("Do you want to continue??? yes || no");
		continueChoice=sc.next();
	}
		while(continueChoice.equalsIgnoreCase("yes"));
	
	}
	

}
