package com.string.easy;

import java.util.Scanner;

/*
 * Simple Symbols
Have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable sequence by either returning the string true or false. 
The str parameter will be composed of + and = symbols with several characters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol. 
So the string to the left would be false. 
The string will not be empty and will have at least one letter.

Examples
Input: "+d+=3=+s+"
Output: true

Input: "f++d+"
Output: false*/

public class SimpleSymbols {

	public static void main(String[] args) {
		System.out.println("\t[ Inside SimpleSymbols ]");
		Scanner s = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: " + simpleSymbols1(inputStr));
		System.out.println("\nSoution 2 answer: " + simpleSymbols2(inputStr));
		System.out.println("\nSoution 2 answer: " + simpleSymbols3(inputStr));
		s.close();
	}

	public static String  simpleSymbols1(String str) {
		
		for(int i = 0; i < str.length(); i++)
	    {
	        char c = str.charAt(i);
	        int len = str.length();
	        if(Character.isLetter(c))
	        {
	            if((i == 0) || (i == (len-1)) || (str.charAt(i-1) != '+' || str.charAt(i+1) != '+'))
	            {
	                return "false";
	            }
	            
	        }
	    }
	    return "true";
	}

	public static String simpleSymbols2(String str) {
		if (str.length() < 3 || Character.isLetter(str.charAt(0))) {
			return "false";
		}

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) && (i == str.length() - 1 || i == 0)) {
				return "false";
			}

			else if (Character.isLetter(str.charAt(i))) {

				if (str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
					return "false";
				}

			}

		}
		return "true";
	}

	public static String simpleSymbols3(String str) {
		if (str.length() < 3 || Character.isLetter(str.charAt(0))) {
			return "false";
		}
		for (int i = 1; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
					return "false";
				}
			}

		}
    return "true";
	}

}
