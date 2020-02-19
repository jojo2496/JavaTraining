package com.JLTI.pojo;

public class Account extends Object {

	private int accountNumber;
	private static int accountNumberGenerator=1000;
	private String name;
	private double balance;
	public int count;
	
	public Account() {
		System.out.println("Default constructor of Account...");
		

	}

	

	

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;

		System.out.println("Parameterized constructor of Account...");
	}
	

	public Account(String name, double balance) {
		super();
		accountNumberGenerator++;	
		accountNumber=accountNumberGenerator;
		this.name = name;
		this.balance = balance;	
		System.out.println("2 param constructor of Account" );


	}

	public boolean Withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean Deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}

		return false;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
