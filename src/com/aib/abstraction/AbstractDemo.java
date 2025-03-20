package com.aib.abstraction;

public abstract class AbstractDemo {

	/*
	 * one of the important concepts of OOPS is abstraction
	 * 
	 * showing only the body and hiding the implementation details in basically the
	 * abstraction
	 * 
	 * e.g. amazon calls icici banks method to check balance of the user and then
	 * if balance is positive then the product amount is deducted/cut and then order is placed
	 * here amazon only called the method of icici and only inputs the amount to be deducted.
	 * 
	 * it doesn't care about the implementation logic which is basically hiding the implementation details
	 * 
	 * Rules for abstraction:
	 * - abstract class must be declared abstract
	 * - abstract class can have abstract as well as non-abstract methods
	 * - it has constructor
	 * - it has static methods also 
	 * - multiple inheritance not allowed using abstraction
	 */
	
	abstract void run();
}
