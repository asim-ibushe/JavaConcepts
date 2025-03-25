package com.aib.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsEx {

	// Method that declares multiple exceptions
    public static void readFileAndDivide(String filePath, int divisor) throws IOException, ArithmeticException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        reader.close();

        int number = Integer.parseInt(line); // May throw NumberFormatException (Unchecked)
        System.out.println("Result: " + (number / divisor)); // May throw ArithmeticException
    }

	/*
	 * public static void main(String[] args) { try {
	 * readFileAndDivide("numbers.txt", 0); // Invalid divisor, will cause an
	 * exception } catch (IOException e) { System.out.println("File error: " +
	 * e.getMessage()); } catch (ArithmeticException e) {
	 * System.out.println("Math error: " + e.getMessage()); } catch (Exception e) {
	 * // Catch any other unexpected exceptions
	 * System.out.println("An unexpected error occurred: " + e.getMessage()); } }
	 */
    
    public static void main(String[] args) throws ArithmeticException, IOException {
		
    	readFileAndDivide("numbers.txt", 0);
	}
}
