package com.aib.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MethodOverridingTest {

	// poly means many
	// morph means forms

	// we can achieve polymorphism in two ways
	// one is method overloading and other is method overriding.

	// Method overriding
	// - exists in different class
	// - method name must be same
	// - type of parameters, number of parameters must be same
	// - return type must be same 
	// - exception thrown must be same or co-variant type (means same class or the subclass of exception allowed)
	// - logic implemented doesn't matter
	// - need of super class and sub class relationship
	
	public MethodOverridingTest() {

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
		
		MethodOverridingTest mt = new MethodOverridingTest();
		mt.add(1.1, 2, 3);
		mt.add(34, 34);
	}
}
