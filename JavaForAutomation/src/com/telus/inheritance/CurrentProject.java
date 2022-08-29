package com.telus.inheritance;
/*========================================================
| Author :  Tanvi Srivastava
| Project:  Selenium for Automation
| Purpose:  To implement inheritance concept.  
| Date   :  03/08/2022
 *=======================================================*/

/*
 * Multilevel Inheritance
 * CurrentProject class extending EmployeeDepartment class 
 * which is again extending Employee class
 */ 
public class CurrentProject extends EmployeeDepartment {

	//User defined method to display current project of employee.
	public void project(String projectName) {
		System.out.println("Current project of employee is: "+projectName);
		System.out.println("Current Project class is executed.");
		System.out.println("****************************************");

	}

	public static void main(String[] args) {
		//Object declaration for CurrentProject class.
		CurrentProject objectProject =new CurrentProject();

		objectProject.empPersonalDetails("Manisha",45);
		objectProject.empContactDetails("9987448745");
		objectProject.department("Development");
		objectProject.project("Register Demo");

	}

}
