package com.string.easy;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println("\t[ Inside Palindrome ]");
		Scanner s = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: " + palindrome1(inputStr));
		System.out.println("\nSoution 2 answer: " + palindrome2(inputStr));
		System.out.println("\nSoution 3 answer: " + palindrome3(inputStr));
		s.close();
	}

	public static  String  palindrome1(String str) {
		StringBuffer strReverve = new StringBuffer();
	      str = str.replaceAll("\s+", "");
	      
	      for (int i =  str.length()-1; i >= 0; i--)
	          strReverve.append(str.charAt(i));
	      
	      return str.equals(strReverve.toString())?"TRUE":"FALSE";
	}

	public static  String  palindrome2(String str) {
		str=str.replaceAll("[^a-zA-Z]", "").toLowerCase();
	  	char[] charArray=str.toCharArray();
	    
	    for(int i=0;i<charArray.length/2;i++){
	     	if(charArray[i]!=charArray[charArray.length-1-i]) return "false"; 
	    }
	    return "true";
	}
	
	public static  String  palindrome3(String str) {
		String reversed = new StringBuilder(str).reverse().toString().replaceAll("\s", "");
        return str.replaceAll("\s", "").equals(reversed) ? "true" : "false";
	}
}
