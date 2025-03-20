package com.aib.encapsulation;

public class TestEncap {

	public static void main(String[] args) {

		User u = new User();
		u.setAge(1);
		System.out.println(u.getAge());

		User u1 = new User();
		u1.setAge(67);
		System.out.println(u1.getAge());

		User u2 = new User();
		u2.setAge(-11);
		System.out.println(u2.getAge());
	}
}
