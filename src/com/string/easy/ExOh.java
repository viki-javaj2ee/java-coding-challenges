package com.string.easy;

import java.util.Scanner;

/*
 * Ex Oh
Have the function ExOh(str) take the str parameter being passed and return the string true if there is an equal number of x's and o's, otherwise return the string false. Only these two letters will be entered in the string, no punctuation or numbers. For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's.

Examples
Input: "xooxxo"
Output: true

Input: "x"
Output: false
*/
public class ExOh {

	public static void main(String[] args) {
		System.out.println("\t[ Inside ExOh ]");
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = sc.nextLine();

		System.out.println("\nSoution 1 answer: " + exOh1(inputStr));
		System.out.println("\nSoution 2 answer: " + exOh2(inputStr));
		System.out.println("\nSoution 2 answer: " + exOh3(inputStr));
		sc.close();
	}
	
	public static String exOh1(String str) {
		
		if (str.length() % 2 != 0)
			return "false";  
		
		 int counterX=0,counterO=0;
		    for(int i=0;i<str.length();i++){
		        if(str.charAt(i)=='x' || str.charAt(i)=='X'){
		            counterX++;
		        }else if(str.charAt(i)=='o' || str.charAt(i)=='O'){
		            counterO++;
		        }
		    }  
		    if(counterO==counterX)
		        return "true";
		    return "false";

	}

	public static String exOh2(String str) {
		if (str.length() / 2.0 == str.replace("x", "").length()) {
            return "true";
        }
        return "false";
	}

	public static String exOh3(String str) {
		int x = 0;
	    int o = 0;
	    for(int i = 0; i < str.length(); i++){
	      x += (str.charAt(i) == 'x') ? 1 :0;
	      o += (str.charAt(i) == 'o') ? 1 :0;
	    }
	       
	    return x == o ? "true":"false";
	}

}
