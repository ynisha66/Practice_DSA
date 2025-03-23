package com.example.practice_problems;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesinString {

	public static void main(String[] args) {
		String str1 = "aaaa bdcyuwey udwewedwhb duduwudbu";
		String str = str1.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}
			else {
				map.put(ch, 1);
			}
		}
		Set<Character> keys = map.keySet();
		for (char c : keys) {
			if(map.get(c)>1) {
				System.out.println(c + "-->" + map.get(c));
			}
		}
		
		

	}

}
