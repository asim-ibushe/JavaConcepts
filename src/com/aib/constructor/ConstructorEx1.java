package com.aib.constructor;

public class ConstructorEx1 {
	
	// Constructor: is a special type of method used to initialize objects in java
	/*Rules to create constructor
	 * - same name as class
	 * - no return type, not even void
	 * - can be overloaded, can't be overriden
	 * - first line should be always this() or super()
	 * - constructor can be private, public, protected, default
	 * - constructor cannot be final, static
	 * - constructor also cannot through an exception
	 * - when we don't create a constructor, a default constructor is created
	 */
	
	public ConstructorEx1() {
		System.out.println("I am in ConstructorEx1");
	}
	
	public ConstructorEx1(int a) {
		System.out.println("I am in ConstructorEx1");
	}
	
	public ConstructorEx1(int a, int b) {
		System.out.println("Sum of "+a+" "+b+" is : "+(a+b));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// different ways to call a constructor
		ConstructorEx1 cex1 = new ConstructorEx1();
		new ConstructorEx1();
		
		// till java 8, newInstance() was used:
		Class.forName("com.aib.constructor.ConstructorEx1").newInstance();
		
		// from java 9, getDeclaredConstructors() method is used as newInstance() method is deprecated
		Class.forName("com.aib.constructor.ConstructorEx1").getDeclaredConstructors();
		
		System.out.println("==========");
		ConstructorEx1 c1 = new ConstructorEx1(12, 11);
	}
	
}
