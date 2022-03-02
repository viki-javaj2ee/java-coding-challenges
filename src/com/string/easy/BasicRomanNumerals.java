package com.string.easy;

import java.util.Scanner;

/*
 * Basic Roman Numerals
Have the function BasicRomanNumerals(str) read str which will be a string of Roman numerals. The numerals being used are: I for 1, V for 5, X for 10, L for 50, C for 100, D for 500 and M for 1000. In Roman numerals, to create a number like 11 you simply add a 1 after the 10, so you get XI. But to create a number like 19, you use the subtraction notation which is to add an I before an X or V (or add an X before an L or C). So 19 in Roman numerals is XIX.

The goal of your program is to return the decimal equivalent of the Roman numeral given. For example: if str is "XXIV" your program should return 24

Examples
Input: "IV"
Output: 4

Input: "XLVI"
Output: 46
*/

public class BasicRomanNumeralsTest {

	public static void main(String[] args) {
		System.out.println("\t[ Inside BasicRomanNumerals ]");
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = sc.nextLine();

		System.out.println("\nSoution 1 answer: " + basicRomanNumerals1(inputStr));
		System.out.println("\nSoution 2 answer: " + basicRomanNumerals2(inputStr));
		System.out.println("\nSoution 2 answer: " + basicRomanNumerals3(inputStr));
		sc.close();
	}
	
	public static String basicRomanNumerals1(String str) {
		 return null;
	}

	public static String basicRomanNumerals2(String str) {
		 return null;
	}

	public static String basicRomanNumerals3(String str) {
		 return null;
	}	
}
