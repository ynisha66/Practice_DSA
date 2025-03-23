package com.example.javatutorials;

public class ForLoop {

	public static void main(String[] args) {
		/*int arr[]= {1,2,3,4,5};
		//foreach loop
		for(int n : arr) {
			System.out.println("Printing for each");
			System.out.println(n + " ");
			
		}
		
		//for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Printing for loop");
			System.out.println(i + " ");*/
		int n =6;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k= n-i+1; k<=n; k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
