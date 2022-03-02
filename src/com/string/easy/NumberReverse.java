package com.string.easy;

import java.util.Scanner;

/*
 * Number Reverse
Have the function NumberReverse(str) take the str parameter being passed which will be a string of numbers, and return a new string with the numbers in reverse order.

Examples
Input: "1 2 3"
Output: 3 2 1

Input: "10 20 50"
Output: 50 20 10

*/

public class NumberReverse {
	public static void main(String[] args) {
		System.out.println("\t[ Inside NumberReverse ]");
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = sc.nextLine();

		System.out.println("\nSoution 1 answer: " + numberReverse1(inputStr));
		System.out.println("\nSoution 2 answer: " + numberReverse2(inputStr));
		sc.close();
	}
	
	public static String numberReverse1(String str) {
		String rev="";
	    String[] tokens=str.split("\\s");
	     for(int i=tokens.length-1;i>=0;i--)
	     {
	       rev+=tokens[i]+" ";
	     }
	    return rev;
	}

	public static String numberReverse2(String str) {
		String strAry[] = str.split(" ");

	    StringBuilder buf = new StringBuilder();
	    for(int i = strAry.length - 1; i > -1 ; i--){
	        buf.append(strAry[i]+" ");
	    }
	    return buf.toString();
	}

}
