package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInGivenIntArray {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] arr = {12, 34, 15, 15, 34, 100};
		
		System.out.println("======================= Method 1 ===========================");
		Map<Integer, Integer> map = new HashMap<>();
		for (int value : arr) {
			map.put(value, (map.getOrDefault(value, 0)+1));
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Key : "+entry.getKey() +" ==> Duplicates : "+entry.getValue());
		}
		
		System.out.println("======================= Method 2 ===========================");
	}

}
