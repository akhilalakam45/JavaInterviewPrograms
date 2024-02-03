package com.practice.exceptionhandling;


class Engineer {
	
	protected int age ;
	
	public void setAge(int age) {
		if(age < 18 || age > 58 ) {
			
			throw new IllegalArgumentException("invalid age");
			//throw new IllegalArgumentException("invalid age");
		}
		
		this.age = age;
	}
	
	public int divide(int a, int b) throws Exception {
	    if (b == 0) {
	        throw new Exception("Cannot be divided by zero");
	    }
	 
	    return a / b;
	}
	
}

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		
		try {
		Engineer engineer = new Engineer();
		engineer.setAge((int)a);
		
		System.out.println("Engineer age: "+engineer.age);
		}catch (IllegalArgumentException e) {
			System.err.println(e +", please enter valid age");
		}
	}

}
