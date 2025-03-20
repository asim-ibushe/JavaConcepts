package com.aib.finalkeyword;

public class FinalTest2Client {

	public static void main(String[] args) {

		FinalTest ft = new FinalTest();
		// method calling
		ft.m1();
		ft.m2();
		System.out.println("====");
		// variable calling
		System.out.println(ft.a);
		System.out.println(FinalTest.c);
	}
}
