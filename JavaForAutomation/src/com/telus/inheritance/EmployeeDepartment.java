package com.telus.inheritance;
/*========================================================
| Author :  Tanvi Srivastava
| Project:  Selenium for Automation
| Purpose:  To implement inheritance concept.  
| Date   :  03/08/2022
 *=======================================================*/

/* Single Level inheritance
 * EmployeeDepartment class extending Employee class using extends keyboard.
 */
public class EmployeeDepartment extends Employee{

	//User defined method to display department name of employee.
	public void department(String departmentName) {
		System.out.println("The department of employee is: "+departmentName);
		System.out.println("Employee Department class is executed.");
		System.out.println("****************************************");

	}


	public static void main(String[] args) {
		//Object declaration for EmployeeDepartment class.
		EmployeeDepartment objectDepartment=new EmployeeDepartment();

		objectDepartment.empPersonalDetails("Rehan",852);
		objectDepartment.empContactDetails("665478974");
		objectDepartment.department("Testing");

	}

}
