package com.telus.programmingfundamentals;

public class JavaDataType {

	public static void main(String[] args) {
		/* This program will 
		 * display the use of 
		 * different data types 
		 * in Java	
		 */

		// byte data type=> To store the day of week	
		byte weekDay=2;
		System.out.println("Weekday "+weekDay);
		
		// short data type=> To store age 
		short age=28;
		System.out.println("The age of customer is "+age);
		
		// int data type=> To store ID of Employee
		int empID=1345;
		System.out.println("Employee ID is "+empID);
		
		// long data type=> To store transaction ID
		long transactionID=986631479654236452L;
		System.out.println("transaction ID => "+transactionID);
		
		// float data type=> To store price of a product
		float productPrice=957.23f;
		System.out.println("Total amount = Rs "+productPrice);
		
		// float data type=> To store tax amount 
		float tax=(float)57.23;
		System.out.println("Payable tax = Rs "+tax);
		
		// double data type=> To store share of shareholder
		double share=65.326545569874233;
		System.out.println("Company's share=> "+share);
		
		// boolean data type=> To store status
		boolean status=true;
		System.out.println("Assignment status = "+status);
		
		// char data type=> To show presence of employee
		char attendence='Y';
		System.out.println("Attendence = "+attendence);
		
		// String data type=> To store address of customer
		String address="Noida, Uttar Pradesh";
		System.out.println("Address of customer => "+address);

	}

}
