package com.practice.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface A1 {
	public void sayHello();
}

class SuperClass {
	public void superHello(){
		System.out.println("I am inside SuperTest class");
	}
}

class ChildClass extends SuperClass{
	
	public void childHello() {
		System.out.println("I am inside SubTest class");
	}
	
	public void testHello() {
		
		//***Using Method reference :super class method***//
		A1 a1= super::superHello;
		a1.sayHello();
		
		//***Using Lambda Expression :super class method***//
		A1 a3= () -> System.out.println("I am inside SuperTest class");
		a3.sayHello(); 
		
		//***Using Method reference :current class method***//
		A1 a2= this::childHello;
		a2.sayHello();
		
		//***Using Lambda Expression :current class method***//
		A1 a4= () -> System.out.println("I am inside SubTest class");
		a4.sayHello();
	}
}


public class MethodReferenceInSuperClass {
	
public static void main(String[] args) {	
		
		ChildClass t = new ChildClass();
		t.testHello();
	
	}

}
