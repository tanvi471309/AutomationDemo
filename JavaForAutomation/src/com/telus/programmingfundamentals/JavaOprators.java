package com.telus.programmingfundamentals;

public class JavaOprators {

	public static void main(String[] args) {
		/* Program to show the 
		 * use of 
		 * different types of
		 * operators in java
		 */

		// 1.Assignment Operator
		int value1=50;
		int value2=25;
		System.out.println("Value1 = "+value1);
		System.out.println("Value2 = "+value2);
		System.out.println("******************************");

		// 2. Arithmetic Operators
		// For Addition
		int sum=value1+value2;
		System.out.println("Sum of numbers = "+sum); 

		// For Subtraction 
		int difference=value1-value2;
		System.out.println("Difference of numbers = "+difference);

		// For Multiplication
		int product=value1*value2;
		System.out.println("Product of numbers = "+product);

		// For Division
		int division=value1/value2;
		System.out.println("Quotient of numbers = "+division);

		// For Remainder
		int remainder=value1%value2;
		System.out.println("Remainder after division= "+remainder);
		System.out.println("******************************");

		// 3. Equality and Relational Operator
		System.out.println("Both values are equal? "+(value1==value2));
		System.out.println("Value1 is greator? "+(value1>value2));
		System.out.println("Value2 is greator? "+(value1<value2));
		System.out.println("Value2 is greator or equal to value1? "+(value1<=value2));
		System.out.println("Value2 is less or equal to value1? "+(value1>=value2));
		System.out.println("Both values are not equal? "+(value1!=value2));
		System.out.println("******************************");
		// 4. Conditional Operator
		// AND
		System.out.println("Value1 is greator and equal to value2=> "+(value1>value2&&value1==value2));
		System.out.println("Value1 is greator and less to value2=> "+(value1>value2&&value1<value2));
		System.out.println("Value1 is greator and not equal to value2=> "+(value1>value2&&value1!=value2));
		System.out.println("******************************");
		// OR
		System.out.println("Value1 is greator or equal to value2=> "+(value1>value2||value1==value2));
		System.out.println("Value1 is greator or less to value2=> "+(value1>value2||value1<value2));
		System.out.println("Value1 is less or not equal to value2=> "+(value1<value2||value1!=value2));
		System.out.println("******************************");

		// 5. Unary Operator
		// Post Increment
		System.out.println("Post Increment");
		System.out.println("Initial value = "+value1);
		int value3=value1++;
		System.out.println("Assigned value = "+value3);
		System.out.println("Incremented value = "+value1);
		System.out.println("******************************");

		// Pre Increment
		System.out.println("Pre Increment");
		System.out.println("Initial value = "+value2);
		int value4=++value2;
		System.out.println("Assigned value = "+value4);
		System.out.println("Incremented value = "+value2);

	}

}
