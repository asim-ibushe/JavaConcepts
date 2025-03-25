package com.aib.exception;

public class TryCatchHierarchyEx2 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
		} 
		catch (ArithmeticException e) {
			System.out.println("At");
			e.getMessage();
			e.printStackTrace();
		} 
		catch (Exception e1) {
			System.out.println("Here");
			e1.printStackTrace();
			e1.getMessage();
		}
		System.out.println("Hello World");
	}
}
