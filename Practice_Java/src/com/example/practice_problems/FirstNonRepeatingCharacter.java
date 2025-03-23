package com.example.practice_problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcf";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) +1);
				
			}
			else {
				map.put(ch, 1);
			}	
		}
	    
	    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			if(map.get(key)==1) {
				System.out.println("First non repeating character: " + key);
				break;
			}
		}
	    

	
	}
}
