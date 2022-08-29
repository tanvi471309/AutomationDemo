package com.telus.inheritance;
/*========================================================
| Author :  Tanvi Srivastava
| Project:  Selenium for Automation
| Purpose:  To implement inheritance concept.  
| Date   :  03/08/2022
 *=======================================================*/

/* Hierarchical inheritance
 * EmployeePerformance class extending Employee class 
 */
public class EmployeePerformance extends Employee {
	//User defined method to display performance of an employee.
	public void performance() {
		System.out.println("Performance report is generated.");
		System.out.println("Employee Performance class is executed.");
		System.out.println("****************************************");

	}

	public static void main(String[] args) {
		//Object declaration for EmployeePerformance class.
		EmployeePerformance objectPerformance=new EmployeePerformance();
		objectPerformance.empPersonalDetails("Ankur",23);
		objectPerformance.empContactDetails("7412589633");
		objectPerformance.performance();
	}

}
