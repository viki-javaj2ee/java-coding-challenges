package com.string.easy;

import java.util.Scanner;

/*
 * FizzBuzz
Have the function FizzBuzz(num) take the num parameter being passed and return all the numbers from 1 to num separated by spaces, 
but replace every number that is divisible by 3 with the word "Fizz", replace every number that is divisible by 5 with the word "Buzz", 
and every number that is divisible by both 3 and 5 with the word "FizzBuzz". 
For example: if num is 16, then your program should return the string "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16". 
The input will be within the range 1 - 50.

Examples
Input: 3
Output: 1 2 Fizz

Input: 8
Output: 1 2 Fizz 4 Buzz Fizz 7 8
*/

public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println("\t[ Inside FizzBuzz ]");
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\nEnter number - ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("\nSoution 1 answer: " + fizzBuzzFizzBuzz1(num));
		System.out.println("\nSoution 2 answer: " + fizzBuzzFizzBuzz2(num));
		sc.close();
	}
	
	public static String fizzBuzzFizzBuzz1(int num) {
		
		if (num<1 || num >50)
			return "Please enter rage between 1-50";
		
		String result = "";
	    for( int i = 1; i <= num; i++){
	     
	      if(i % 3 ==0){
	        result += "Fizz";
	      }
	      if(i % 5 ==0){
	        result += "Buzz";
	      }
	      if(i % 3 !=0 && i % 5 != 0 ){
	        result += i;
	      }
	       if(i != num){
	        result += " ";
	      }

	    }
	    return result;
	}

	public static String fizzBuzzFizzBuzz2(int num) {

		if (num<1 || num >50)
			return "Please enter rage between 1-50";
		
		String divisibleBy3 = "Fizz";
	    String divisibleBy5 = "Buzz";
	    String divisibleByBoth = "FizzBuzz";
	    StringBuilder builder = new StringBuilder();

	    for (int i = 1; i <= num; i++) {
	      if (i % 3 == 0 && i % 5 == 0) {
	        builder.append(divisibleByBoth).append(" "); 
	      } else if (i % 3 == 0) {
	        builder.append(divisibleBy3).append(" ");
	      } else if (i % 5 == 0) {
	        builder.append(divisibleBy5).append(" ");
	      } else {
	        builder.append(String.valueOf(i)).append(" ");
	      }
	    }
	    return builder.toString();
	}
}
