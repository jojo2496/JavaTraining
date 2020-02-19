package com.JLTI.main;

import com.JLTI.pojo.Account;

public class AccountMainV1 {

	public static void main(String[] args) {
		System.out.println("We are in Main...");

		Account account;
		account = new Account();
		System.out.println(account.hashCode());
		System.out.println(account);
		System.out.println("------------------------------------------------------------------------");
		account = new Account(101, "Saurabh Joshi", 2000.0);
		System.out.println(account.hashCode());
		System.out.println(account);
		System.out.println("------------------------------------------------------------------------");
		System.out.println(account.hashCode());
		System.out.println(account);
		System.out.println("------------------------------------------------------------------------");

		Account account2 = account;
		System.out.println(account2); // same values
		System.out.println(account2.hashCode()); // same hash code
		account2.setName("JoJo");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(account2);
		System.out.println(account);
		System.out.println(account.hashCode());

		System.out.println("Main ends...");

	}

}
