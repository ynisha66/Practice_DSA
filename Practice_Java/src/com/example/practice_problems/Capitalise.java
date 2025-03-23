package com.example.practice_problems;

public class Capitalise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "hello world from java";
		        // Split the string into words
		        String[] words = str.split(" ");

		        // StringBuilder to hold the result
		        StringBuilder result = new StringBuilder();

		        // Iterate through each word
		        for (String word : words) {
		            if (word.length() > 0) {
		                // Capitalize the first character and append the rest of the word
		                result.append(Character.toUpperCase(word.charAt(0)))
		                      .append(word.substring(1))
		                      .append(" ");
		            }
		        }

		        // Convert StringBuilder to String and trim the extra space at the end
		        System.out.println(result.toString().trim());
		    }
		


	}


