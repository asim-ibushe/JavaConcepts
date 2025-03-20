package com.aib.statickeyword;

public class StaticTest2 {

	int a = 10;
	static int b = 20;

	public void m1() {
		System.out.println("I am in StaticTest2 m1()");
		System.out.println(a);
		System.out.println(b);
		m2();
	}

	public static void m2() {
		System.out.println("I am in StaticTest2 m2()");
	}

	public static void main(String[] args) {

		// direct call to method and the variable without creating an object
		System.out.println(StaticTest2.b);
		m2();
		System.out.println("=========");
		StaticTest2 st2 = new StaticTest2();
		System.out.println(st2.a);
		System.out.println(StaticTest2.b);
		StaticTest2.m2();
		System.out.println("======");
		st2.m1();

	}
}
