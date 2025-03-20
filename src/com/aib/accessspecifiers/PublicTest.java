package com.aib.accessspecifiers;

// public applicable to outer class
public class PublicTest {

	// public applicable to inner class
	public class InnerClass1 {

	}

	// public applicable to constructor
	public PublicTest() {

	}

	// public applicable to method
	public void m1() {

	}

	// public applicable to static method
	public static void m2() {

	}

	// public applicable to global variables
		int a = 1;
		static int b = 3;

	// public not applicable to variable inside of the method
	// uncomment the following code to see the compile error
	/*
	 * public void m3() { public int c = 31; }
	 */

}
