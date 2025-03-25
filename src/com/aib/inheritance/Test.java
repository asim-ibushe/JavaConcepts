package com.aib.inheritance;

public class Test {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		a.m1();
		a.m2();

		System.out.println("=====");
		B b = new B();
		System.out.println(b.a); // 10
		System.out.println(b.b); // 30
		System.out.println(b.c); // 40
		b.m1(); // A m1
		b.m2(); // B m2
		b.m3(); // B m3

		System.out.println("=====");
		// dynamic dispatch (assigning subclass to super class) also knows as virtual function in cpp
		A a1 = new B();
		System.out.println(a1.a); // 10
		System.out.println(a1.b); // 20
		a1.m1(); // A m1
		a1.m2(); // B m2
		//Not allowed as control flows from base to child class and reference is of class type A
		//a1.m3();

	}
}
