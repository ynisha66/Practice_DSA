package com.example.practice_problems;

public class CountCapitalfromString {

	public static void main(String[] args) {
		String str = "HerE Is The StRing";
		int upperCaseCharCount=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCharCount++;
			}
		}
		System.out.println("Count of upper case character: " + upperCaseCharCount);
	}

}
