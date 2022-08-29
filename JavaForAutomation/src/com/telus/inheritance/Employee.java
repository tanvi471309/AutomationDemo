package com.telus.inheritance;
/*========================================================
| Author :  Tanvi Srivastava
| Project:  Selenium for Automation
| Purpose:  To implement inheritance concept. 
| Date   :  03/08/2022
 *=======================================================*/

//A class with user defined methods
public class Employee {

	//User defined method to display personal details of employee.
	public void empPersonalDetails(String empName,int empID) {
		System.out.println("Employee name is: "+empName);
		System.out.println("Employee ID is: "+empID);
		System.out.println("Employee class is executed.");
	}

	//User defined method to display contact details of employee.
	public void empContactDetails(String contactNum) {
		System.out.println("Employee's contact number is: "+contactNum);
		System.out.println("Employee class is executed.");
		System.out.println("****************************************");

	}

	//Pre defined method main()
	public static void main(String[] args) {
		//Object declaration for Employee class.
		Employee objectEmp=new Employee();

		objectEmp.empPersonalDetails("Tanya",123);
		objectEmp.empContactDetails("2222266547");

	}

}
