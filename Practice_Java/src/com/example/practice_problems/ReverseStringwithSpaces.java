package com.example.practice_problems;

public class ReverseStringwithSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "hello world";
		        char[] arr = str.toCharArray();
		        int left = 0, right = arr.length - 1;

		        while (left < right) {
		            if (arr[left] == ' ') {
		                left++;
		            } else if (arr[right] == ' ') {
		                right--;
		            } else {
		                // Swap non-space characters
		                char temp = arr[left];
		                arr[left] = arr[right];
		                arr[right] = temp;

		                left++;
		                right--;
		            }
		        }

		        System.out.println("Reversed string: " + new String(arr));

		    }
		


	}


