package com.aib.interfaceex;

public class InterfacDemo implements InterfaceI1 {

	@Override
	public void m1() {
		System.out.println("I am the m1() of interface InterfaceI1");
		
	}
	
	public static void main(String[] args) {
		
		InterfacDemo id = new InterfacDemo();
		id.m1();
	}

	
}
