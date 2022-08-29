package com.telus.arrayimplementation;
/*=====================================================
| Author :  Tanvi Srivastava
| Project:  Programming for Automation
| Purpose:  A Java program to implement array. 
| Date   :  22/07/2022
 *====================================================*/
public class ArraySample {

	public static void main(String[] args) {
		
		// Integer array declaration and initialization
		int arrMarks[]= {30,35,48,39,49,33};
		
		// Printing array
		for(int countArr : arrMarks) {
			System.out.println(countArr);
		}
		System.out.println("***************************************");
		
		//String array declaration and initialization
		String arrSubject[] = {"English","Hindi","Maths","Science","Computer","GK"};

		// Printing array
		for(String countArr : arrSubject) {
			System.out.println(countArr);
		}
		System.out.println("***************************************");
	}

}
