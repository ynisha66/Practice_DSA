package com.example.practice_problems;

import java.util.Stack;

public class ValidParenthesis {
	public static void main (String[] args) {
		String str = "()";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch=='{' ||ch =='[') {
				stack.push(ch);
			}
			else if( !stack.empty() && (ch == ')' && stack.peek() != '(' )|| (ch == '}' && stack.peek() != '{' ) || (ch == ']' && stack.peek() !='[' )){
				System.out.println("Not valid parenthesis");
				return;
			}
			
		}
		System.out.println("Parenthesis");
	}
	
	
//logic : 1. string containing parenthesis
//2. traverse through string if open brackets found push on stack
//3. if close brackets found->check if stack not empty -> compare if top stack has open brackets.. then pop it
//4. else not parenthesis
//5. come out of traverse loop 
//check if stack is empty then valid else not.
}
