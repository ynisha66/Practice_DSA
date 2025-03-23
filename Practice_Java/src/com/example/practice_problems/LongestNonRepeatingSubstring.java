package com.example.practice_problems;

import java.util.HashSet;

public class LongestNonRepeatingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcd";
		HashSet<Character> set = new HashSet<Character>();
		
		int start = 0;
		int maxlength = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(set.contains(ch)) {
				set.remove(str.charAt(start));
				start++;
			}
			
			set.add(ch);
			maxlength = Math.max(maxlength, i-start+1);
		}
		System.out.println(maxlength);

	}

}
