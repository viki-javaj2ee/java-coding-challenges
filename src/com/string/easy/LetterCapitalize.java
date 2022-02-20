package com.string.easy;

import java.util.Scanner;

/*Letter Capitalize
Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. 
Words will be separated by only one space.

Examples
Input: "hello world"
Output: Hello World

Input: "i ran there"
Output: I Ran There*/

public class LetterCapitalize {
	
	public static void main(String[] args) {
		System.out.println("\t[ Inside LetterCapitalize ]");
		Scanner s = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: " + letterCapitalize1(inputStr));
		System.out.println("\nSoution 2 answer: " + letterCapitalize2(inputStr));
		System.out.println("\nSoution 3 answer: " + letterCapitalize3(inputStr));
		s.close();
	}
	
	public static String letterCapitalize1(String str) {
		StringBuffer sb = new StringBuffer();
	    String[] words = str.split("\s");
	    for (int i = 0; i < words.length; i++){
	      sb.append(Character.toUpperCase(words[i].charAt(0)));
	      sb.append(words[i].substring(1));
	      sb.append(" ");       
	    }
	    return sb.toString().trim();
	}

	public static String letterCapitalize2(String str) {
		String ret = "";
    	for (int i = 0; i < str.length(); i++) {
			if(i-1<0 || str.charAt(i-1) == ' '){
				ret += Character.toUpperCase(str.charAt(i));
			}else{
				ret += str.charAt(i);
			}
		}
    return ret;
    
	}
	
	public static String letterCapitalize3(String str) {
		String[] ar = str.split(" ");
		   String res = "";
		   for(int i = 0; i < ar.length; i++)
		   {
		       String first = ar[i].substring(0,1).toUpperCase();
		       String rest = ar[i].substring(1);
		       res = res + first+rest+" ";
		   }
		       
		    return res;
	}
}
