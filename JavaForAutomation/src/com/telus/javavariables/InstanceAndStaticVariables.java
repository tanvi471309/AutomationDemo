package com.telus.javavariables;

/*========================================================================
| Author :  Tanvi Srivastava
| Project:  Programming for Automation
| Purpose:  A program to explain different types of variables used in Java
| Date   :  22/07/2022
 *=======================================================================*/

public class InstanceAndStaticVariables {

	// Declaration and initialization of instance variable

	String studNameOne="Rajeev Sharma";
	int studentRollNoOne=3;
	int studClassOne=5;
	String studAddressOne="Gomti Nagar, Lucknow";
	float studMarksOne=86.25f;	
	char studGradeOne='A';	

	String studNameTwo="Sanjeev Raj";
	int studentRollNoTwo=4;
	int studClassTwo=5;
	String studAddressTwo="Karolbaag, Lucknow";
	float studMarksTwo=63.50f;	
	char studGradeTwo='B';	

	//Declaration and initialization of static variable
	static String schoolName="Lucknow Model School";
	static int schoolCode=837683;


	public static void main(String[] args) {
		//Creating object
		InstanceAndStaticVariables studOne=new InstanceAndStaticVariables();

		System.out.println("Details of student-");	

		//Calling instance variable
		System.out.println("Name 		=>	"+studOne.studNameOne);
		System.out.println("Roll Number 	=>	"+studOne.studentRollNoOne);
		System.out.println("Class 		=> 	"+studOne.studClassOne);
		System.out.println("Address 	=> 	"+studOne.studAddressOne+".");
		System.out.println("Marks 		=> 	"+studOne.studMarksOne);
		System.out.println("Grade 		=> 	"+studOne.studGradeOne);

		//Calling static variable 
		System.out.println("School Name 	=>  	"+schoolName);
		System.out.println("School Code 	=>  	"+schoolCode);
		System.out.println("**********************************************");
		
		//Creating object
		InstanceAndStaticVariables studTwo=new InstanceAndStaticVariables();
		
		//Calling instance variable
		System.out.println("Details of student-");	
		System.out.println("Name 		=>	"+studTwo.studNameTwo);
		System.out.println("Roll Number 	=>	"+studTwo.studentRollNoTwo);
		System.out.println("Class 		=> 	"+studTwo.studClassTwo);
		System.out.println("Address 	=> 	"+studTwo.studAddressTwo+".");
		System.out.println("Marks 		=> 	"+studTwo.studMarksTwo);
		System.out.println("Grade 		=> 	"+studTwo.studGradeTwo);

		//Calling static variable 
		System.out.println("School Name 	=>  	"+schoolName);
		System.out.println("School Code 	=>  	"+schoolCode);
		System.out.println("**********************************************");



	}

}
