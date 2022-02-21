package com.string.easy;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * AB Check
Have the function ABCheck(str) take the str parameter being passed and return the string true if the characters a and b are separated by exactly 3 places 
anywhere in the string at least once (ie. "lane borrowed" would result in true because there is exactly three characters between a and b). 
Otherwise return the string false.

Examples
Input: "after badly"
Output: false

Input: "Laura sobs"
Output: true
*/

public class ABCheck {

	public static void main(String[] args) {
		System.out.println("\t[ Inside ABCheck ]");
		Scanner s = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: " + abCheck1(inputStr));
		System.out.println("\nSoution 2 answer: " + abCheck2(inputStr));
		System.out.println("\nSoution 2 answer: " + abCheck3(inputStr));
		System.out.println("\nSoution 2 answer: " + abCheck4(inputStr));
		s.close();
	}

	public static String abCheck1(String str) {
		 return Boolean.toString(str.matches(".*a.{3}?b.*"));
	}
	
	public static String abCheck2(String str) {
		for (int i = 0; i < str.length() - 4; i++) {
			if ((str.charAt(i) == 'a' && str.charAt(i + 4) == 'b')
					|| (str.charAt(i) == 'b' && str.charAt(i + 4) == 'a')) {
				return "true";
			}
		}
		return "false";
	}

	public static String abCheck3(String str) {
		str = Pattern.compile("([aA].{3}[bB])|([bB].{3}[aA])").matcher(str).replaceAll("a   b");
		if (str.contains("a   b")) {
			return "true";
		}
		return "false";
	}

	public static String abCheck4(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				if (i + 4 < str.length()) {
					if (str.charAt(i + 4) == 'b')
						return "true";
				}
			}
			if (str.charAt(i) == 'b') {
				if (i + 4 < str.length()) {
					if (str.charAt(i + 4) == 'a')
						return "true";
				}
			}
		}
		return "false";
	}

}
