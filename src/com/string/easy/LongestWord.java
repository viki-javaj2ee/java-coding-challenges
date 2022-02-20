package com.string.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Longest Word

Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string. 
If there are two or more words that are the same length, return the first word from the string with that length. 
Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"

Examples
Input: "fun&!! time"
Output: time

Input: "I love dogs"
Output: love
*/

public class LongestWord {

	public static void main(String[] args) {
		System.out.println("\t[ Inside LongestWord ]");
		Scanner s = new Scanner(System.in);		

		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();
		
		System.out.println("\nSoution 1 answer: "+longestWord1(inputStr));
		System.out.println("\nSoution 2 answer: "+longestWord2(inputStr));
		System.out.println("\nSoution 3 answer: "+longestWord3(inputStr));
		System.out.println("\nSoution 4 answer: "+longestWord4(inputStr));
		s.close();
	}

	public static String longestWord1(String sen) {

		String[] senArray = sen.split("[^a-z^A-Z^0-9]");

		int longestIndex = 0;
		String longestWord = "";

		for (int i = 0; i < senArray.length; i++) {
			// System.out.println(senArray[i]);
			if (senArray[i].length() > longestIndex) {
				longestWord = senArray[i];
				longestIndex = senArray[i].length();
			}
		}

		return longestWord;
	}
	
	public static String longestWord2(String sen) {
		
		 return Arrays.stream(sen.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
	}
	
	public static String longestWord3(String sen) {
		String[] words = sen.replaceAll("[^A-Za-z0-9\s]", "").trim().split(" ");
	    String longestWord = words[0];
	    for (int i = 1; i < words.length; i++) {
	        if (longestWord.length() < words[i].length())
	            longestWord = words[i];
	    }
	    return longestWord;		
	}
	
	public static String longestWord4(String sen) {
	    String[] ss = sen.split("\s+");
	    int maxCharCount = 0;
	    String longestString = "";
	    for(String s : ss) {
	      int cnt = 0;
	      StringBuilder sb = new StringBuilder();
	      for(int i=0; i<s.length(); i++) {
	        char c = s.charAt(i);
	        if(Character.isLetterOrDigit(c)) {
	          cnt++;
	          sb.append(c);
	        }
	      }
	      if(cnt > maxCharCount) {
	        maxCharCount = cnt;
	        longestString = sb.toString();
	      }
	    }
	    return longestString;
	}


}
