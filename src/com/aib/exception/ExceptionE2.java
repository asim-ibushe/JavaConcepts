package com.aib.exception;

 /* Any abnormal condition in the program which obstructs the 
  * normal flow of the program is called exception.
 */

public class ExceptionE2 {
	
	// below is the normal flow of the program without exception

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			System.out.println("Hello world !!");
		} catch (Exception e) {
			System.out.println("In exception block");
			//e.printStackTrace();
			e.printStackTrace();
			
		} finally {
			System.out.println("End of program !!!");
		}
		
		System.out.println("Hello world 1!!");
	}
}
