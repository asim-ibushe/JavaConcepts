package com.aib.accessspecifiers;

//protected keyword not applicable to outer class, gives illegal modifier compile error
public class ProtectedTest {

	// protected applicable to inner class
	protected class InnerClass1 {

	}

	// protected applicable to constructor
	protected ProtectedTest() {

	}

	// protected applicable to method
	protected void m1() {

	}

	// protected applicable to static method
	protected static void m2() {

	}

	// protected applicable to global variables
	protected int a = 1;
	protected static int b = 3;

	// protected not applicable to variable inside of the method
	// uncomment the following code to see the compile error
	/*
	 * public void m3() { protected int c = 31; }
	 */

}
