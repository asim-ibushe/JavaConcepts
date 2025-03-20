package com.aib.accessspecifiers;

// 'default' keyword means applying no access specifier. It is applicable to outer class
class DefaultTest {

	// applicable to inner class
	class InnerClass1 {

	}

	// applicable to constructor
	DefaultTest() {

	}

	// applicable to method
	void m1() {

	}

	// applicable to static method
	public static void m2() {

	}

	// applicable to global variables
	int a = 1;
	static int b = 3;

	// applicable to variable inside of the method
	public void m3() {
		int c = 31;
	}

}
