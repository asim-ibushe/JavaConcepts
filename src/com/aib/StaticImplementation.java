package com.aib;

public class StaticImplementation {

	int a = 10;
	static int b = 10;

	public void m1() {
		System.out.println("I am instance StaticImplementation m1()");
		System.out.println(a);
		System.out.println(b);
		m2();
	}

	public static void m2() {
		System.out.println("I am static StaticImplementation m2()");
		System.out.println(b);

	}

	public static void main(String[] args) {

		System.out.println(b);
		m2();
		System.out.println("======");
		StaticImplementation si = new StaticImplementation();
		System.out.println(si.a);
		si.m1();
		System.out.println(b);
		m2();

	}
}
