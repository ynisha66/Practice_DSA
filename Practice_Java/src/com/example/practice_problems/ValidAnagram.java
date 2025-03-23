package com.example.practice_problems;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "nnnisha";
		String str2 = "innnha";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		if (str1.length()!= str2.length()) {
			System.out.println("Not");
			return;
		}
		
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
			
		}
		
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if(!map.containsKey(ch)) {
				System.out.println("Not");
				return;
			}
			map.put(ch, map.get(ch)-1);
			if (map.get(ch)<0) {
				System.out.println("Not");
				return;
				
			}
		}
		System.out.println("Valid");
		

	}

}
