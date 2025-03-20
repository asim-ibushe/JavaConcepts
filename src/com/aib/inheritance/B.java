package com.aib.inheritance;

public class B extends A {

	int b = 30;
	int c = 40;
	
	public B() {
		System.out.println("I am constructor of B");
	}

	public void m2() {
		System.out.println("I am in B m2()");
	}

	public void m3() {
		System.out.println("I am in B m3()");
	}
}
