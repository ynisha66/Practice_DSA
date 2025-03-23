package com.example.practice_problems;

import java.util.HashMap;

public class CountCharacterinString {
//	public static void main(String[] args) {
//		String str = "Nisha Yadav";
//		int count = 0;
//		int spaces = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == ' ') {
//				spaces++;
//			    continue;
//			}
//			count++;
//			
//		}
//		System.out.println("Spaces is:" + spaces);
//		System.out.println("Count is:" + count);
//	}
	
//	using hashmap
	public static void main(String[] args) {
		String str = "Nisha Yadav";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
			
		}
	System.out.println("Count of characters :" + map);
	int totalcount =0;
	for (int count : map.values()) {
		totalcount += count;
		
	}
	System.out.println("Total count of character is : " + totalcount);


		
	}
	
}
