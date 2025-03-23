package com.example.practice_problems;

public class ValidPalindrome {
	public static void main(String[] args) {
		String str = "moM ,@  ";
		String originalstr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
//		String reverseString = "";
//		for (int i = originalstr.length()-1; i>=0; i--) {
//			reverseString += originalstr.charAt(i);
//		}
//		if(originalstr.equals(reverseString)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
		int i =0;
		int j = originalstr.length()-1;
		while(i<=j) {
			if(originalstr.charAt(i)!=originalstr.charAt(j)) {
				 System.out.println("Not");
				 return;
			}
			i++;
			j--;
			
		}
		
		System.out.println("Palindrome");
		
	}
	
	

}
