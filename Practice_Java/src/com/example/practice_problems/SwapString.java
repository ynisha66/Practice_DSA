	package com.example.practice_problems;

    public class SwapString {
		public static void main(String[] args) {
//			Scanner input = new Scanner(System.in);
//	
//				System.out.println("Enter First String: ");
//				String s1 = input.nextLine();
//				System.out.println("Enter Second String: ");
//				String s2 = input.nextLine();
			String s1 = "Nisha";
			String s2 = "Yadav";
				
				//logic to swap string: Nisha Yadav ... NishaYadav
				String s3 = s1+s2;
				System.out.println("s3: " + s3);
				s2 = s3.substring(0, s1.length());
				System.out.println("print:" + s3.substring(0));
				s1 = s3.substring(s2.length());
				System.out.println("s1:" + s1);
				System.out.println("s2:" + s2);
				
//			String temp = s1;
//			s1=s2;
//			s2=temp;
//			System.out.println("s1:" + s1);
//			System.out.println("s2:" + s2);
			
			
	}
	
		
		
	
	}
