package com.string.easy;

import java.util.Scanner;

/*Serial Number
Have the function SerialNumber(str) take the str parameter being passed and determine if it is a valid serial number with the following constraints:

1. It needs to contain three sets each with three digits (1 through 9) separated by a period.
2. The first set of digits must add up to an even number.
3. The second set of digits must add up to an odd number.
4. The last digit in each set must be larger than the two previous digits in the same set.

If all the above constraints are met within the string, the your program should return the string true, otherwise your program should return the string false. For example: if str is "224.315.218" then your program should return "true".

Examples
Input: "11.124.667"
Output: false

Input: "114.568.112"
Output: true
*/
public class SerialNumberTest {
	
	public static void main(String[] args) {
		System.out.println("\t[ Inside SerialNumber ]");
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\nEnter string - ");
		String inputStr = sc.nextLine();

		System.out.println("\nSoution 1 answer: " + serialNumber1(inputStr));
		System.out.println("\nSoution 2 answer: " + serialNumber2(inputStr));
		System.out.println("\nSoution 3 answer: " + serialNumber3(inputStr));
		sc.close();
	}
	
	public static String serialNumber1(String str) {
		 return null;
	}

	public static String serialNumber2(String str) {
		 return null;
	}

	public static String serialNumber3(String str) {
		 return null;
	}

}
