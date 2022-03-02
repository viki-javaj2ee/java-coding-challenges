package com.string.easy;

import java.util.Scanner;

/*
 * Consonant Count

Have the function ConsonantCount(str) take the str string parameter being passed and return the number of consonants the string contains.

Examples
Input: "Hello World"
Output: 7

Input: "Alphabets"
Output: 6
*/

public class ConsonantCount {

	public static void main(String[] args) {
		System.out.println("\t[ Inside ConsonantCount ]");
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = sc.nextLine();

		System.out.println("\nSoution 1 answer: " + consonantCount1(inputStr));
		System.out.println("\nSoution 2 answer: " + consonantCount2(inputStr));
		sc.close();
	}
		
	public static String consonantCount1(String str) {
	    String smallVowel = "aeiou";  
	    String capitalVowel = "AEIOU";
	    int count = 0;
	    for(int i = 0; i < str.length(); i++)
	    {
	      char c = str.charAt(i);
	      if(!smallVowel.contains(c+"") && !capitalVowel.contains(c+"") && Character.isLetter(c)){
	        count ++;
	      }
	    }
	    return String.valueOf(count);
	}

	public static String consonantCount2(String str) {
		int count = 0;
	    for(int i = 0; i < str.length(); i++) {
	        if(!(""+str.charAt(i)).matches("[AEIOUaeiou]")) {
	            count++;
	        }
	    }
	    return String.valueOf(count);
	}
}
