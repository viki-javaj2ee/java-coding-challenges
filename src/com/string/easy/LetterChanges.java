package com.string.easy;

import java.util.Scanner;

/*
 * Letter Changes
Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. 
Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.

Examples
Input: "hello*3"
Output: Ifmmp*3

Input: "fun times!"
Output: gvO Ujnft!
*/
public class LetterChanges {
	
	public static void main(String[] args) {
		System.out.println("\t[ Inside LetterChanges ]");
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: "+letterChanges1(inputStr));
		System.out.println("\nSoution 2 answer: "+letterChanges2(inputStr));
		s.close();
	}

	public static String letterChanges1(String str) {
		StringBuilder result = new StringBuilder();
        char[] strChars = str.toLowerCase().toCharArray();
        char[] replacements = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
        for (int i = 0; i < str.length(); i++) {
            result.append(strChars[i] >= 'a' && strChars[i] <= 'z' ? replacements[strChars[i] - 97] : strChars[i]);
        }
        return result.toString();
	}

	public static String letterChanges2(String str) {
		StringBuilder newstr = new StringBuilder();
	    for (int i=0;i<str.length(); i++){
	        char ch = str.charAt(i);
	        if (Character.isLetter(ch)){
	            ch += 1;
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ 
	                newstr.append(Character.toUpperCase(ch));
	            } else {
	                newstr.append(Character.toString(ch));
	            }
	        } else {
	        	newstr.append(Character.toString(ch));;
	        }
	    }
	    return newstr.toString();
	}

}
