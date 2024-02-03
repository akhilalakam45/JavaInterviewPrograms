package com.practice.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.sound.midi.Track;

class Car {
	public int numOfWheels = 9;
	
	
	private static int i = m3(); 

    static {
    	//i=56;
    	m1(); //method call from static block
      
      
      System.out.println("Static block");
    }

    public static void m1() {
       m2(); //method call from another static method
       // accessing static variable directly without class name
       i=30;
      
       System.out.println(i); 
       System.out.println("Static method m1()");
    }
    
    public static void m2() {
        System.out.println("Static method m2()");
        // accessing static variable with class name from static method
        System.out.println(i); 
     }

     public static int m3() {
        return 10;
     }

     public void m4() {
        // accessing static variable with class name from non-static method
        System.out.println(i); 
        i=40;
        m3(); //method call from another non-static method
     } 

     public static void main(String[] str) {
        //m1(); m2(); //method call from main method
        System.out.println("main() method");
     }
	
	public void start() {
		System.out.println("start the car");
	}
}

class A extends Car {
	 public static void m2() {
		 System.out.println("i'm from A class");
	 }
}

class Truck extends Car{
	
	public Truck() {
		numOfWheels = 8;
		
	}
	
	public void start(){
		System.out.println(numOfWheels);
		System.out.println("stop");
	}
	
}



public class FindDuplicates {
	
	
	public static void main(String[] args) {
		
	
		/*
		 * int [] input = {2,3,6,4,5,4};
		 * 
		 * String [] stringInput = {"akhil", "sudha", "akhil", "jai", "sudha"};
		 * 
		 * 
		 * for(int index = 0 ; index<stringInput.length; index++) {
		 * System.out.println("index : " +index); for(int temp=index+1;
		 * temp<stringInput.length; temp++) { System.out.println("temp : " +temp);
		 * if(stringInput[index] == stringInput[temp]) {
		 * System.out.println(stringInput[index]+ " is duplicate String"); } }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * Set newSet = new HashSet<>();
		 * 
		 * for (String string : stringInput) {
		 * 
		 * if(newSet.add(string) == false) { System.out.println(string
		 * +" is duplicate String"); }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * Map<String, Integer> map = new HashMap<>();
		 * 
		 * for(String name : stringInput) {
		 * 
		 * Integer count = map.get(name);
		 * 
		 * if(count == null) { map.put(name, 1); }else { map.put(name, ++count); } }
		 * 
		 * Set<Entry<String, Integer>> set =map.entrySet();
		 * 
		 * for(Entry<String, Integer> entry : set) {
		 * 
		 * if(entry.getValue()>1) { System.out.println("duplicate : "+entry.getKey()
		 * +" presence : " +entry.getValue()); }else {
		 * System.out.println("non-duplicate : "+entry.getKey()); }
		 * 
		 * }
		 * 
		 */	
		
		/*
		 * Map<String,String> map = new HashMap<String,String>();
		 * map.put("Effective Java", "Kathy Sierra"); map.put("Spring in Action",
		 * "Craig Walls"); map.put("Hibernate in Action", "Gavin King");
		 * map.put("Pro Angular", "Freeman"); map.put("Pro Spring Boot",
		 * "Felipe Gutierrez");
		 * 
		 * map.computeIfPresent("Pro Angular", (key, value) -> "akhil");
		 * 
		 * map.entrySet().iterator() .forEachRemaining(System.out::println);
		 * 
		 * 
		 * Truck truck = new Truck();
		 * 
		 * truck.start();
		 * 
		 * Car.m1(); Car.m2();
		 */
		
		
		A a = new A();
		
		a.m2();
		
		
	
	}

}
