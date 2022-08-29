package com.telus.javacontrolstatements;
/*==============================================================
| Author :  Tanvi Srivastava
| Project:  Programming for Automation
| Purpose:  A Java program to print numbers in descending order 
| Date   :  21/07/2022
 *=============================================================*/
public class ForLoop {
	
	public static void main(String[] args) {
		
		/* This program will print 
		 * numbers from 10 to 1 
		 * in reverse order.
		 */
		int count;
		System.out.println("Numbers in descending order=>");
		// The for loop statement
		for(count=10;count>=1;count--) {
			System.out.println(count);
		}

	}

}
