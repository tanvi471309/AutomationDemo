package com.telus.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String,String> userDetails=new HashMap<String,String>();

		//Using put() method to input value
		userDetails.put("firstName", "Tanvi");
		userDetails.put("lastName", "Srivastava");
		userDetails.put("gender", "Female");
		userDetails.put("emailID", "tanvi.srivastava@gmail.com");
		userDetails.put("address", "231-A, Noida, UP");
		userDetails.put("mobileNumber", "8795462136");

		//Finding size of Hashmap using size() method
		System.out.println("Size of hashmap is: "+userDetails.size());
		System.out.println("Values contained in hashmap are: ");
		System.out.println(userDetails);
		System.out.println("***************************************************************************");

		HashMap<Integer,HashMap<String,String>> userID=new HashMap<Integer,HashMap<String,String>>();
		userID.put(1234, userDetails);
		System.out.println("Size of hashmap is: "+userID.size());
		System.out.println(userID);
		System.out.println("***************************************************************************");

		//Printing value to which the key is mapped
		System.out.println("First Name => "+userDetails.get("firstName"));
		System.out.println("Last Name => "+userDetails.get("lastName"));
		System.out.println("Gender => "+userDetails.get("gender"));
		System.out.println("Email ID => "+userDetails.get("emailID"));
		System.out.println("Address => "+userDetails.get("address"));
		System.out.println("Mobile Number => "+userDetails.get("mobileNumber"));
		System.out.println("***************************************************************************");

		//Retrieving value using for each 
		for(Map.Entry<String,String> details:userDetails.entrySet())
		{
			System.out.println(details.getKey() +"->" + details.getValue());
		}
		System.out.println("***************************************************************************");

		//Replacing value using replace() method
		userDetails.replace("mobileNumber","6987456321");
		System.out.println(userDetails); 

		//Deleting value using remove() method
		System.out.println(userDetails.remove("address"));
		System.out.println(userDetails);

		//Remove() method using key and value
		System.out.println(userDetails.remove("mobileNumber", "6987456321"));
		System.out.println(userDetails);  
	}
}
