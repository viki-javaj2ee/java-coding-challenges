package com.string.easy;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/*
 * Word Count
Have the function WordCount(str) take the str string parameter being passed and return the number of words the string contains 
(e.g. "Never eat shredded wheat or cake" would return 6). 
Words will be separated by single spaces.

Examples
Input: "Hello World"
Output: 2

Input: "one 22 three"
Output: 3
*/

public class WordCount {

	public static void main(String[] args) {
		System.out.println("\t[ Inside WordCount ]");
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: "+wordCount1(inputStr));
		System.out.println("\nSoution 2 answer: "+wordCount2(inputStr));
		System.out.println("\nSoution 3 answer: "+wordCount3(inputStr));
		System.out.println("\nSoution 4 answer: "+wordCount4(inputStr));
		s.close();	
	}
	
	public static  int  wordCount1(String str) {
		return (str.split("\s")).length;
	}

	public static  int  wordCount2(String str) {
	    String[] splited = str.split(" ");
	    return splited.length;
	}

	
	public static  int  wordCount3(String str) {
		StringTokenizer sTokens = new StringTokenizer(str, " ");
	    return sTokens.countTokens();
	}
	
	public static  int  wordCount4(String str) {
		int wordCount = 1;
	    for(int i = 0; i < str.length(); i++){
	        if(str.charAt(i) == ' ')
	            wordCount++;
	    }
	    return wordCount;
	}
	

}
