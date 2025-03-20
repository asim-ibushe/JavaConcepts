package com.aib.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MethodOverloadingTest {

	// poly means many
	// morph means forms

	// we can achieve polymorphism in two ways
	// one is method overloading and other is method overriding.

	// Method overloading
	// - exists in same class
	// - method name must be same
	// - type of parameters must be different or number of parameters or the order of parameters
	// - return type doesn't matter
	// - exception thrown doesn't matter
	// - logic implemented doesn't matter
	// - no need of super class and sub class relationship

	public MethodOverloadingTest() {

	}

	// two integer
	public void add(int a, int b) throws IOException {
		System.out.println(a + b);
	}
	
	// type of parameter changed or is different
	public void add(double a, int b) throws SQLException {
		System.out.println(a + b);
	}
	
	// number of parameters changed
	public void add(double a, int b, int f) throws FileNotFoundException {
		System.out.println(a + b + f);
	}
	
	// order of parameters
	public void add( int b, double a) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) throws IOException {
		
		MethodOverloadingTest mt = new MethodOverloadingTest();
		mt.add(1.1, 2, 3);
		mt.add(34, 34);
	}
}
