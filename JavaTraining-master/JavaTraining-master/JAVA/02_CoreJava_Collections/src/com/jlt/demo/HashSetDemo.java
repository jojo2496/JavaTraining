package com.jlt.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	private Set<String> stringSet = new HashSet<String>();

	public void printSet() {
		stringSet.add("Savita");
		stringSet.add("Priya");
		stringSet.add("Bhabhi");
		
		
		//System.out.println(hash);
		System.out.println(stringSet);
		
		
//		
//		int hash=numberSet.hashCode();
//		for(int i:numberSet) {
//			System.out.println(hash);
//		}
		
		for(String string:stringSet) {
			System.out.println("Value:: "+ string +" Hashcode:: "+string.hashCode());
		}
		
		
	}

}
