	package com.example.practice_problems;
	
	import java.util.HashMap;
import java.util.Map;
	
	public class StringwithCount {
	
		public static void main(String[] args) {
			//Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
				String str = "aabbccc";
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
				StringBuilder result = new StringBuilder();
				for (Map.Entry<Character, Integer> entry : map.entrySet()) {
					char key = entry.getKey();
					int val = entry.getValue();
					result.append(key).append(val);
					
				}
				System.out.println("Expected Output: " + result.toString());

						
			}
			
		}
	
