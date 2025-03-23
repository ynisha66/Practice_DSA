package com.example.practice_problems;

import java.util.HashMap;
import java.util.Map;

public class StringWithCount2 {

	public static void main(String[] args) {
		String str = "a2b3";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			//a
			if(Character.isLetter(ch)) {
				//2
				if(i+1<str.length() && Character.isDigit(str.charAt(i+1))) {
					int count = Character.getNumericValue(str.charAt(i+1));
				    map.put(ch, count);
				    i++;
				}
			}
		}
		 
		 StringBuilder result = new StringBuilder();
		 for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			char key = entry.getKey();
			int val = entry.getValue();
			
			for (int i = 0; i < val; i++) {
				result.append(key);
				
			}
		}
		 System.out.println("Generated Output: " + result.toString());

	}

}
