package com.aib.interfaceex;

public interface InterfaceI1 {

	/* To solve the problem of multiple inheritance which is not solved using inheritance and also 
	 * the abstract class, we use the concept of interface
	 * 
	 * - we can implement multiple interfaces
	 * - an interface does not have a constructor
	 * - by default the methods in interface are abstract
	 * - from java 8, we can have default and static methods i.e. we can write logic inside them
	 * - from java 9, we can also have private methods inside an interface 
	 * - interface can extend one or more interfaces
	 * - in terms of interfaces we use 'implements' keyword while in terms of abstraction we use the 
	 * 'abstract' keyword
	 * 
	 *  */
	
	void m1();
}
