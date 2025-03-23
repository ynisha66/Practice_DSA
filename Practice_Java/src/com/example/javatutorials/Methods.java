package com.example.javatutorials;

import java.util.Scanner;

public class Methods {
	
	 int sum (int a, int b) {
		int result = a+b;
		System.out.println("Sum" + result);
		return result;
		
	}

	public static void main(String[] args) {
		Methods method = new Methods();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = input.nextInt();
		System.out.println("Enter Second number");
		int b = input.nextInt();
		
		int result = method.sum(a,b);
		System.out.println("Result is:" + result);
	

	}

}
