package com.telus.javacontrolstatements;

public class IfElseIfLadder {
	/*=======================================================
	| Author :  Tanvi Srivastava
	| Project:  Programming for Automation
	| Purpose:  A Java program to explain all String methods 
	| Date   :  21/07/2022
	 *=======================================================*/
	public static void main(String[] args) {
		/* This program displays 
		 * grade of student 
		 * according to the marks.
		 */

		int marks=86;
		System.out.println("Marks=> "+marks);

		// Control statement-> If Else Ladder
		if(marks>=80) {
			System.out.println("Grade=> O");
		}
		else if (marks>=75&&marks<=79) {
			System.out.println("Grade=> A");
		}
		else if (marks>=70&&marks<=74) {
			System.out.println("Grade=> B");
		}
		else if (marks>=60&&marks<=69) {
			System.out.println("Grade=> C");
		}
		else if (marks>=50&&marks<=59) {
			System.out.println("Grade=> D");
		}
		else if (marks>=45&&marks<=49) {
			System.out.println("Grade=> E");
		}
		else if (marks>=40&&marks<=44) {
			System.out.println("Grade=> P");
		}
		else {
			System.out.println("Grade=> F(Fail)");
		}
	}

}
