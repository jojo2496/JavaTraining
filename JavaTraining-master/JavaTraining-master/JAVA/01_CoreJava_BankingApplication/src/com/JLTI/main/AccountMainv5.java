package com.JLTI.main;

import com.JLTI.pojo.Current;

public class AccountMainv5 {

	public static void main(String[] args) {

		Current current = new Current("Vivek Gohil", 10000, 50000);
		System.out.println(current);
		
		current.Withdraw(5000);
		System.out.println(current);
		//balance = 5000 and overdraftBalance = 50000

		System.out.println("----------------------------");
		current.Withdraw(15000);
		System.out.println(current);
		//balance = 0 and overdraftBalance = 40000
		
		System.out.println("----------------------------");
		current.Deposit(5000);
		System.out.println(current);
		//balance = 0 and overdraftBalance = 45000
		
		System.out.println("----------------------------");
		current.Deposit(15000);
		System.out.println(current);
		//balance = 10000 and overdraftBalance = 50000
		
		System.out.println("----------------------------");
		
	}

}
