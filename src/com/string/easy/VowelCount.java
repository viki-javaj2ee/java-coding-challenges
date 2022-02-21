package com.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Vowel Count
Have the function VowelCount(str) take the str string parameter being passed and return the number of vowels the string contains (ie. "All cows eat grass and moo" would return 8). Do not count y as a vowel for this challenge.

Examples
Input: "hello"
Output: 2

Input: "coderbyte"
Output: 3
*/

public class VowelCount {
	
	public static void main(String[] args) {
		System.out.println("\t[ Inside VowelCount ]");
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: "+vowelCount1(inputStr));
		System.out.println("\nSoution 2 answer: "+vowelCount2(inputStr));
		System.out.println("\nSoution 2 answer: "+vowelCount3(inputStr));
		s.close();	
	}
	
	public static  int  vowelCount1(String str) {
		return Pattern.compile("[^aeiouAEIOU]").matcher(str).replaceAll("").length();
	}

	public static  int  vowelCount2(String str) {
		str = str.toUpperCase();
	    
	    List<Character> vowels = Arrays.asList('A','E','I','O','U');
	    
	    int count = 0;
	    for(int i = 0; i<str.length(); i++) {
	        
	        if(vowels.contains(str.charAt(i)))
	            count++;
	        
	    }
	    return count;
	}
	
	public static  int  vowelCount3(String str) {
		int count=0;
	    str=str.toLowerCase();
	    for(int i=0;i<str.length();i++){
	     	if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
	         count++; 
	        }
	    }
	    return count;
	}


}
