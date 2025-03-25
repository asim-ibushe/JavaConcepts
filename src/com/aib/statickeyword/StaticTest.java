package com.aib.statickeyword;

//Outer class cannot be static
public class StaticTest {

	// STATIC: static is a keyword used for memory management.
	// static stands single copy storage
	// e.g. college name
	// we dont have to create an object to invoke a static method or a variable. It
	// can be directly accessed by the class name.
	// most imp point.: static when applied to something, i.e. method or a variable,
	// it belongs to the class rather than the instance of a class

	// static can be applied to inner class
	static class InnterClass1 {

	}

	// static cannot be applied to constructor
	public StaticTest() {

	}

	// static can be applied to instance method
	public static void m1() {

	}

	// can be applied to global variable
	static int a = 10;

	// cannot be applied to the local variable
	// uncomment the following code to see the variable
	/*
	 * public void m2() { static int b = 20; }
	 */

	// static can be applied to a block
	static {

	}

}
