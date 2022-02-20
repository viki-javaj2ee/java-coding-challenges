package com.string.easy;

import java.util.Scanner;

/*First Reverse
Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. 
For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH.

Examples
Input: "coderbyte"
Output: etybredoc

Input: "I Love Code"
Output: edoC evoL I
*/
public class FirstReverse {
	
	public static void main(String[] args) {
		System.out.println("\t[ Inside FirstReverse ]");
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: "+firstReverse1(inputStr));
		System.out.println("\nSoution 2 answer: "+firstReverse2(inputStr));
		System.out.println("\nSoution 3 answer: "+firstReverse3(inputStr));
		
		s.close();
	}
	
	public static String firstReverse1(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static String firstReverse2(String str) {
		String result = "";
		   int len = str.length()-1;
		   for(int i = 0; i< str.length(); i++)
		   {
		       result = result + str.charAt(len-i);
		   }
		       
		    return result;
	}

	public static String firstReverse3(String str) {
		if (str.length() == 1) return str;
	    return str.charAt(str.length() - 1) + firstReverse3(str.substring(0, str.length() - 1));
	}

}
