package com.example.practice_problems;

import java.util.Scanner;

public class ReverseString {

	
	  //using for loop & string concatenation
	  
//		 public static void main(String[] args) { 
//			 Scanner scanner = new
//		 Scanner(System.in); 
//		 while (true) {
//		  System.out.println("Enter the string you want to reverse:"); 
//		  String original_String = scanner.nextLine(); 
//		  if (original_String.equalsIgnoreCase("exit")) {
//		  System.out.println("Exiting the program"); 
//		  break;
//		  }
//		 
//		 
//		 String reverse_String = "";
//		 
//		  
//		  for (int i = original_String.length()-1 ; i>=0; i--) { reverse_String +=
//		  original_String.charAt(i); }
//		  
//		  //if I want the first char of string to be in upper case.
//		  
//		  if (!reverse_String.isEmpty()) { String firstChar =
//		  reverse_String.substring(0, 1).toUpperCase(); String restChar =
//		  reverse_String.substring(1); reverse_String = firstChar + restChar;
//		 
//		  } System.out.println("Reversed String:" + reverse_String);
//		  
//		  } }
//	 

	/*
	 * using two pointers approach step1: convert string into char array one
	 * pointer at start one at end /have while condn and check swap the value and
	 * move accordingly
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the string to reverse: ");
			String original = scanner.nextLine();
			if (original.equalsIgnoreCase("exit")) {
				System.out.println("Exit program");
				break;
			}
			char[] charArray = original.toCharArray();
			int start = 0;
			int end = charArray.length-1;
			while(start<end) {
				//swapping the characters
				char temp = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = temp;
				start++;
				end--;
			}
			String reversedString = new String(charArray);
			System.out.println("Reversed String: " + reversedString);
		}

	}

}
