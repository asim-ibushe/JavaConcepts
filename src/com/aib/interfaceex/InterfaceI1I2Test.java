package com.aib.interfaceex;

public class InterfaceI1I2Test implements InterfaceI2, InterfaceI3 {

	@Override
	public void m1() {
		System.out.println("Running successfully and also multiple inheritace done");

	}
	
	public static void main(String[] args) {
		
		InterfaceI1I2Test it = new InterfaceI1I2Test();
				it.m1();
	}

}
