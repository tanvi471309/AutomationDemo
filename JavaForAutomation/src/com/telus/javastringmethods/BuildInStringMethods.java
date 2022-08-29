package com.telus.javastringmethods;
/*=======================================================
| Author :  Tanvi Srivastava
| Project:  Programming for Automation
| Purpose:  A Java program to explain all String methods 
| Date   :  22/07/2022
 *=======================================================*/
public class BuildInStringMethods {

	public static void main(String[] args) {
		/* This program will display
		 * various build in string methods 
		 * used in Java and its application.
		 */

		// String declaration
		String info="Welcome to the world of programming!";
		System.out.println("Given string=> "+info);
		System.out.println("====================================");

		// 1. length() method will return the number of characters contained in a string.
		System.out.println("There are "+info.length()+" characters in the given string.");
		System.out.println("====================================");

		//2. toLowerCase()method convert all upper case characters in lower case characters. 
		System.out.println(info.toLowerCase());
		System.out.println("====================================");

		//3. toUpperCase()method convert all lower case characters in upper case characters. 
		System.out.println(info.toUpperCase());
		System.out.println("====================================");

		//4. trim() method is used to omit all white spaces before and after the string.
		String name="  Tanvi Srivastava  ";
		System.out.println(name);
		System.out.println(name.trim());
		System.out.println("====================================");

		// 5. concat() method concatenates multiple strings into single one.
		String firstName="Tanvi";
		String lastName=" Srivastava";
		System.out.println(firstName+lastName);
		System.out.println("Hello ".concat(firstName).concat(lastName));
		System.out.println("====================================");

		/* 6. String comparison methods check for equality of the strings and return true or false as result.
		 *Use ASCII value to compare
		 *equals() considering case of characters.
		 *equalsIgnoreCase()ignoring case.
		 */

		String firstName1="TANVI";
		System.out.println(firstName==firstName1);
		System.out.println(firstName.equals(firstName1));
		System.out.println(firstName.equalsIgnoreCase(firstName1));
		System.out.println("====================================");

		/* 7. CompareTo()method compare the strings (based on index) and return 0, +ve or -ve value accordingly. 
		 * If both strings are equal=> 0
		 * If first string is greater=> +ve value
		 * If second string is greater=> -ve value
		 * compareToIgnoreCase()method ignores the case while comparison. 
		 */
		System.out.println(firstName.compareTo(firstName1));
		System.out.println(firstName1.compareTo(firstName));
		System.out.println(firstName.compareToIgnoreCase(firstName1));
		System.out.println("====================================");

		String address="Noida, Uttar Pradesh";

		//8. charAt() method returns the character at given index in the string. 
		System.out.println(address.charAt(10));
		System.out.println("====================================");

		//9. indexOf() method returns the index of given character in the string. 
		System.out.println(address.indexOf('i'));
		System.out.println(address.indexOf('a'));
		System.out.println(address.indexOf('a',6));
		System.out.println("====================================");

		/*10. contains() method checks for the presence of specific 
	    characters in the string and returns true or false accordingly.
		 */
		System.out.println(address.contains("Uttar"));
		System.out.println("====================================");

		//11. substring() method returns a part of the given string according to index.  
		// 	  Two arguments indicates starting and ending index of the substring.
		String course="Learning Java for Automation";
		System.out.println(course.substring(9));
		System.out.println(course.substring(9,17));
		System.out.println("====================================");

		//12. replace() method replaces all the existing word or character.	    
		String newCourse=course.replace("Java","Selinium");
		System.out.println(newCourse);
		System.out.println("====================================");

		String updateLetter=newCourse.replace('S', 's');
		System.out.println(updateLetter);
		System.out.println("====================================");

		//13. Special characters in a string can be handled by using \ symbol.
		String message="\"\\\" symbol is called back slash.";
		System.out.println(message);
		System.out.println("====================================");
		
		
		//14. split() method is used to split a string at the occurrence of given character.
		String note ="Java is a general purpose, high-level, object-oriented programming language.";
		String arrNote[]=note.split(", ");
		for(String countArr:arrNote) {
			System.out.println(countArr);
		}


	}

}
