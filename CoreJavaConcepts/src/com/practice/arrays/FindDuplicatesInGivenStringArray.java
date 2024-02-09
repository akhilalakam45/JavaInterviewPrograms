package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInGivenStringArray {
	
	public static void main(String[] args) {
		
		String [] strArr = {"akhil", "alakam", "sudha", "sudha", "alakam", "jai"};
		Map<String, Integer> map = new HashMap<>();
		
		for (String value : strArr) {
			map.put(value, map.getOrDefault(value, 0)+1);
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : "+entry.getKey() +" ==> Duplicates : "+entry.getValue());
		}
	}

}
