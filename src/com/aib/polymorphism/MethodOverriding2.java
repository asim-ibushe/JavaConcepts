package com.aib.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MethodOverriding2 extends MethodOverridingTest {

	@Override
	public void add(int a, int b) throws IOException {

	}

	@Override
	public void add(double a, int b) throws SQLException {

	}

	@Override
	public void add(double a, int b, int f) throws FileNotFoundException {

	}

	@Override
	public void add(int b, double a) {

	}

}
