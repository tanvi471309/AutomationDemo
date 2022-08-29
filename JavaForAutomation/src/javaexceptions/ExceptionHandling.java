package javaexceptions;
/*=====================================================
| Author :  Tanvi Srivastava
| Project:  Programming for Automation
| Purpose:  A Java program to handle the exceptions. 
| Date   :  14/08/2022
 *====================================================*/
public class ExceptionHandling {

	public static void main(String[] args) {


		//Arithmetic Exception handling
		int dividend=55;
		int divisor=0;

		try
		{
			int quotient=dividend/divisor;
			System.out.println("The quotient is: "+quotient);
		}
		catch(ArithmeticException errorMsg)
		{

			System.out.println("Divide by zero is not possible.");
			System.out.println("Exception occured: "+errorMsg);
		}

		//Null Pointer Exception handling
		String firstName=null;
		try
		{
			int nameLength=firstName.length();
			System.out.println("Number of characters in first name is: "+nameLength);
		}
		catch(NullPointerException errorMsg)
		{
			System.out.println("Unable to count length of firstName because given string contains null value");
			System.out.println("Exception occured: "+errorMsg);
		}

		//Array Index Out Of Bound Exception handling
		int marksList[]=new int[10];
		try
		{
			int lastIndexValue=marksList[10];
			System.out.println("The value present at last index is: "+lastIndexValue);
		}
		catch(ArrayIndexOutOfBoundsException errorMsg)
		{
			System.out.println("Unable to retrieve value from given index.");
			System.out.println("Exception occured: "+errorMsg);
		}

		//Number format Exception handling
		String noteBookPrice="Fifteen";
		String stationaryPrice="Twenty";

		try 
		{
			int productPriceOne=Integer.parseInt(noteBookPrice);
			int productPriceTwo=Integer.parseInt(stationaryPrice);

			int totalPrice=productPriceOne+productPriceTwo;
			System.out.println("Total payable amount: "+totalPrice);
		}
		catch(NumberFormatException errorMsg)
		{
			System.out.println("Unable to perform conversion from String to Integer.");	
			System.out.println("Exception occured: "+errorMsg);	
		}
	}
}
