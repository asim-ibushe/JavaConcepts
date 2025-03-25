package com.aib.finalkeyword;

//final applicable to outer class
final class FinalTest {

	// final is a keyword applied to class method and variables
	// it is applied to outer class, inner class, method, global variable and local
	// variable
	// it cannot be applied to constructor
	// If applied to class => it prevents inheritance
	// if applied to variable => it makes the value as constant and makes the
	// performance faster
	// If applied to method => it prevents overriding

	// final applicable to inner class
	final class InnerClass1 {

	}

	// final cannot be applied to constructor
	// uncomment the following code to see the compile time error
	/*
	 * final FinalTest() {
	 * 
	 * }
	 */

	// final can be applied to method
	final void m1() {
		System.out.println("I am in final method of class FinalTest m1()");
	}

	// can be applied to global variable
	final int a = 10;
	static final int c = 20;

	// can be applied to local variable
	public void m2() {
		final int b = 20;
		System.out.println("I am in normal method of class FinalTest m2(): " + b);
	}

}
