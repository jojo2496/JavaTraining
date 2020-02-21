package com.jlt.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	private Map<Integer,String> userMap=new HashMap<Integer,String>();
	
	public void printMap() {
		userMap.put(101, "Saurabh");
		userMap.put(101, "Rucha");
		userMap.put(102, "Shriya");
		userMap.put(104, "Mehal");
		userMap.put(103, "Sayli");
		userMap.put(105, null);
		userMap.put(null, "Saurabh");
		userMap.put(null, "abc");
		
		
	
		
		System.out.println(userMap);
		
	}

}
