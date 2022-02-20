package com.string.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Codeland Username Validation
Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules:

1. The username is between 4 and 25 characters.
2. It must start with a letter.
3. It can only contain letters, numbers, and the underscore character.
4. It cannot end with an underscore character.

If the username is valid then your program should return the string true, otherwise return the string false.
Examples
Input: "aa_"
Output: false
Input: "u__hello_world123"
Output: true*/

public class CodelandUsernameValidation {

	public static String FALSE = "false";
	public static String TRUE = "true";

	public static void main(String[] args) {
		System.out.println("\t[ Inside CodelandUsernameValidation ]");
		Scanner s = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: " + codelandUsernameValidation1(inputStr));
		System.out.println("\nSoution 2 answer: " + codelandUsernameValidation2(inputStr));
		System.out.println("\nSoution 3 answer: " + codelandUsernameValidation3(inputStr));

		s.close();
	}

	public static String codelandUsernameValidation1(String str) {
		if (str.length() <= 4 || str.length() >= 25) {
			return FALSE;
		}
		if (str.charAt(str.length() - 1) == '_') {
			return FALSE;
		}
		if (!Character.isLetter(str.charAt(0))) {
			return FALSE;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ( (!Character.isLetterOrDigit(ch))  && (ch != '_')) {
				return FALSE;
			}
		}
		return TRUE;
	}

	public static String codelandUsernameValidation2(String str) {
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
        Matcher matcher = p.matcher(str);
        return matcher.matches() ? "true" : "false";
	}

	public static String codelandUsernameValidation3(String str) {

		if(str.matches("[a-zA-Z]+[a-zA-Z0-9_]{0,23}[a-zA-Z0-9]{1}"))
		    return "true";
		return "false";
	}

}
