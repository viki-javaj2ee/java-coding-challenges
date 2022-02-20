package com.string.easy;

import java.util.Scanner;

/*
 * Time Convert
Have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3). 
Separate the number of hours and minutes with a colon.

Examples
Input: 126
Output: 2:6

Input: 45
Output: 0:45
*/

public class TimeConvert {
	
	public static void main(String[] args) {
		System.out.println("\t[ Inside TimeConvert ]");
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: "+timeConvert1(Integer.parseInt(inputStr)));
		System.out.println("\nSoution 2 answer: "+timeConvert2(Integer.parseInt(inputStr)));

		s.close();	
	}
	
	public static  String  timeConvert1(int num) { 
		if(num > 0 && num < 60 )
		   {
		       return "0:" + num;
		   }
		   else
		   {
		       int h = num / 60;
		       int m = num % 60;
		        return h+":"+m;
		   }
	}
	
	public static  String  timeConvert2(int num) {
		return Integer.toString(num / 60) + ":" + Integer.toString(num % 60);
	}

}
