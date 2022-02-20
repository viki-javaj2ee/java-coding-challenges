package com.string.easy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Alphabet Soup
Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo). 
Assume numbers and punctuation symbols will not be included in the string.

Examples
Input: "coderbyte"
Output: bcdeeorty

Input: "hooplah"
Output: ahhloop
*/

public class AlphabetSoup {

	public static void main(String[] args) {
		System.out.println("\t[ Inside AlphabetSoup ]");
		Scanner s = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: " + alphabetSoup1(inputStr));
		System.out.println("\nSoution 2 answer: " + alphabetSoup2(inputStr));
		System.out.println("\nSoution 3 answer: " + alphabetSoup3(inputStr));
		System.out.println("\nSoution 3 answer: " + alphabetSoup4(inputStr));
		s.close();
	}

	public static String alphabetSoup1(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	public static String alphabetSoup2(String str) {
		StringBuilder result = new StringBuilder();
		str.chars().sorted().forEach(c -> result.append((char) c));
		return result.toString();
	}

	public static String alphabetSoup3(String str) {

		char[] chArray = str.toCharArray();
		char temp;
		for (int i = 1; i < chArray.length; i++) {
			temp = chArray[i];
			int j = i;
			while (j > 0 && chArray[j - 1] > temp) {
				chArray[j] = chArray[j - 1];
				j--;
			}
			chArray[j] = temp;
		}
		return String.valueOf(chArray);
	}
	
	public static String alphabetSoup4(String str) {
		boolean isDoneSorting = false;
	    Character tempCharacter;
	    StringBuilder finalString = new StringBuilder(str);
	    
	    while(!isDoneSorting)
	    {
	        isDoneSorting = true;
	        
	        for(int i = 0; i < finalString.length()-1; i++)
	        {
	            
	            if(finalString.charAt(i) > finalString.charAt(i+1))
	            {
	                tempCharacter = finalString.charAt(i);
	                finalString.setCharAt(i, finalString.charAt(i+1));
	                finalString.setCharAt(i+1, tempCharacter);
	                
	                isDoneSorting = false;
	            }
	            
	        }
	    
	        
	    }
	    return finalString.toString();
	}


}
