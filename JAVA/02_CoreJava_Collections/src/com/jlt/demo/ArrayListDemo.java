package com.jlt.demo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	private ArrayList<String> nameList= new ArrayList<String>();
	
	
	public void print() {
		System.out.println("Size:: "+nameList.size());
		nameList.add("Samiksha");
		nameList.add("Swapnali");
		nameList.add("Shaily");
		nameList.add("Praful");
		nameList.add("Swapnil");
		nameList.add("Swapnil");
		nameList.add("Swapnil");
		nameList.add("Swapnil");
		nameList.add("Swapnil");
		nameList.add("Swapnil");

		System.out.println("Size after adding..."+nameList.size());
		System.out.println(nameList);
		nameList.remove("Swapnil");
		System.out.println(nameList);
		//nameList.removeAll();
	}
	
	
}
