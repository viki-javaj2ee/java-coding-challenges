package com.string.easy;

import java.util.Scanner;

/*
 * String Periods
Have the function StringPeriods(str) take the str parameter being passed and determine if there is some substring K that can be repeated N > 1 times to produce the input string exactly as it appears. Your program should return the longest substring K, and if there is none it should return the string -1.

For example: if str is "abcababcababcab" then your program should return abcab because that is the longest substring that is repeated 3 times to create the final string. Another example: if str is "abababababab" then your program should return ababab because it is the longest substring. If the input string contains only a single character, your program should return the string -1.

Examples
Input: "abcxabc"
Output: -1

Input: "affedaaffed"
Output: -1
*/

public class StringPeriodsTest {

	public static void main(String[] args) {
		System.out.println("\t[ Inside StringPeriods ]");
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = sc.nextLine();

		System.out.println("\nSoution 1 answer: " + stringPeriods1(inputStr));
		System.out.println("\nSoution 2 answer: " + stringPeriods2(inputStr));
		System.out.println("\nSoution 3 answer: " + stringPeriods3(inputStr));
		sc.close();
	}
	
	public static String stringPeriods1(String str) {
		 return null;
	}

	public static String stringPeriods2(String str) {
		 return null;
	}

	public static String stringPeriods3(String str) {
		 return null;
	}

}
