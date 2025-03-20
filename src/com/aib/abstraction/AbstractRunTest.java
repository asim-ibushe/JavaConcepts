package com.aib.abstraction;

public class AbstractRunTest extends AbstractDemo {

	@Override
	void run() {
		System.out.println("Running safely !!!");
	}

	public static void main(String[] args) {

		AbstractRunTest at = new AbstractRunTest();
		at.run();
	}

}
