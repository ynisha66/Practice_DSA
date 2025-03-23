package com.example.practice_problems;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,7};
		int n = arr.length;
		int target = 10;
//		boolean pairfound = false;
//		for (int i = 0; i < n; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i] + arr[j] == target) {
//					System.out.println("Nums are: " + arr[i] +" " + arr[j]);
//					pairfound = true;
//					break;
//				}
//			}
//		}
//		if(!pairfound) {
//			System.out.println("No pair found");
//		}
//		

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean pairFound = false;
		for (int i = 0; i < arr.length; i++) {
			int number2 = target - arr[i];
			if(map.containsKey(number2)) {
				System.out.println("Two Nums are: " + arr[i] + " and " + number2);
				pairFound = true;
				break;
				
			}
			map.put(arr[i], i);
			}
		if (!pairFound) {
            System.out.println("No pair found");
        }
		}
	
		
	}


