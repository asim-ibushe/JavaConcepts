package com.aib.encapsulation;

public class User {

	// binding of code and data into a single entity
	// We set properties as private and add setters and getters for providing
	// control over the data (and achiving security)

	private int age;

	public int getAge() {
		return age;
	}

	public int setAge(int age) {
		if (age <= 0 || age >= 59) {
			return 0;
		}
		return this.age = age;
	}

}
