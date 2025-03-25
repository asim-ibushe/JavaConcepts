package com.aib.accessspecifiers;

//private keyword not applicable to outer class, gives illegal modifier compile error
public class PrivateTest {

	// private applicable to inner class
	private class InnerClass1 {

	}

	// private applicable to constructor
	private PrivateTest() {

	}

	// private applicable to method
	private void m1() {

	}

	// private applicable to static method
	private static void m2() {

	}

	// private applicable to global variables
	private int a = 1;
	private static int b = 3;

	// private not applicable to variable inside of the method due to its scope
	// uncomment the following code to see the compile error
	/*
	 * public void m3() { private int c = 31; }
	 */

}
