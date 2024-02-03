package com.practice.polymorphism;

public class Overridden {
	
	public void sleep() {
		System.out.println("i'm going to sleep");
	}
	
	static int sleep(int i) 
	{
		return i;
		}

}


class demo extends Overridden{
	 public void sleep() {
		 
	 }
}
