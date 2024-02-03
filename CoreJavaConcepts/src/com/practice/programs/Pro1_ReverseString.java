package com.practice.programs;

import java.util.Iterator;

public class Pro1_ReverseString {

	public static void main(String[] args) {
		
		System.out.println("---------------METHOD1---------------");
		String str = "akhil";
		StringBuilder builder = new StringBuilder();
		builder.append(str);
		System.out.println(builder.reverse());
		
		
		System.out.println("---------------METHOD2---------------");
		String beforeString2 = "Prassu";
		System.out.println("Input: " + beforeString2);
		String reverseString2 = "";
		char beforeChar[] = beforeString2.toCharArray();
		for(int index=beforeChar.length-1; index >= 0 ; index--) {
			reverseString2 = reverseString2 + beforeChar[index];
		}
		System.out.println("Output: " +reverseString2);
		
		/* We can use 5 types of separators for printing new line
		 * 
		 * String newline = System.lineSeparator();
		 * System.out.println("GFG" + newline + "gfg");
		 *  
		 * System.out.println("GFG" + '\n' + "gfg");
		 * 
		 * String newline = System.getProperty("line.separator");
		 * System.out.println("GFG" + newline + "gfg");
		 * 
		 * System.out.printf("GFG%ngfg");
		 * 
		 * System.out.println("GFG");
		 *  
		 *  */
		
		//System.out.print("\n");
		System.out.println("---------------METHOD3---------------");
		
		String beforeString3 = "original";
		System.out.println("Input: " + beforeString3);
		int length = beforeString3.length();
		String reverseString3 = "";
		for(int index = length-1 ; index >= 0 ; index--) {
			reverseString3 = reverseString3 + beforeString3.charAt(index);
		}
		System.out.println("Output: " +reverseString3);
		
		System.out.println("---------------METHOD4---------------");
		
		String beforeString4 = "legend";
		System.out.println("Input: " + beforeString4);
		String[] token = beforeString4.split("");
		String reverseString4 = "";
		
		for(int index=beforeString4.length()-1 ; index >=0 ; index--) {
		
			reverseString4 = reverseString4 + token[index];
		}
		
		System.out.println("Output: " +reverseString4);
		
		
		
	}

}
