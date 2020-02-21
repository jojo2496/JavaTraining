package com.jlt.demo;

import java.util.TreeMap;

public class TreeMapDemo {

	
	private TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
	
	
	public void display() {
		treeMap.put(101, "Saurabh");
		treeMap.put(101, "Rucha");
		treeMap.put(102, "Shriya");
		treeMap.put(104, "Mehal");
		treeMap.put(103, "Sayli");
		treeMap.put(105, null);
		
		//treeMap.put(null, "Saurabh");
		//treeMap.put(null, "abc");
		
		System.out.println(treeMap);
		
		
		
	}
}
