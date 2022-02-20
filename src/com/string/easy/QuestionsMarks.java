package com.string.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Questions Marks
Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers,letters, and question marks, 
and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. 
If so, then your program should return the string true, otherwise it should return the string false. 
If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.

For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
Examples
Input: "aa6?9"
Output: false

Input: "acc?7??sss?3rr1??????5"
Output: true

*/
public class QuestionsMarks {

	public static void main(String[] args) {
		System.out.println("\t[ Inside QuestionsMarks ]");
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nEnter string - ");
		String inputStr = s.nextLine();

		System.out.println("\nSoution 1 answer: "+questionsMarks1(inputStr));
		System.out.println("\nSoution 2 answer: "+questionsMarks2(inputStr)+" - this is not correct for 'acc5???4acc'.  as not checking for sum 10");
		System.out.println("\nSoution 3 answer: "+questionsMarks3(inputStr));

		s.close();
	}

	public static String questionsMarks1(String str) {
		int n1 = 0, n2 = 0, count = 0, tens = 0;

		char[] chars = str.replaceAll("[^?0-9]", "").toCharArray();

		for (char c : chars) {
			if (Character.isDigit(c) && n1 == 0)
				n1 = (int) (c - '0');
			else if (c == '?' && n1 != 0)
				count++;
			else if (Character.isDigit(c) && n1 != 0) {
				n2 = (int) (c - '0');
				if (n1 + n2 == 10) {
					if (count != 3)
						return "false";
					tens++;
					n1 = 0;
					n2 = 0;
					count = 0;
				}
			}
		}
		return (tens > 0) ? "true" : "false";

	}
	
	public static String questionsMarks2(String str) {
		str = str.replaceAll("[a-z]", "");
	       Pattern pattern = Pattern.compile("([0-9])([?])([?])([?])([0-9])");
	       Pattern falseP1 = Pattern.compile("([0-9])([?])([?])([0-9])");
	       Pattern falseP2 = Pattern.compile("([0-9])([?])([0-9])");
	       Matcher falseMatchP1 = falseP1.matcher(str);
	       Matcher falseMatchP2 = falseP2.matcher(str);
	       Matcher matchPattern = pattern.matcher(str);
	       if (falseMatchP1.find() || falseMatchP2.find()){
	           return "false";
	       }
	       if (matchPattern.find()){
	           return "true";
	       }
	       return "false";
	}
	
	public static String questionsMarks3(String str){
		String numMarks = str.replaceAll("[^0-9?]", "");
        Pattern p = Pattern.compile("(\\d\\?+\\d)");
        Matcher m = p.matcher(numMarks);
        boolean matched = false;
        while (m.find()) {
            String match = m.group();
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1));
            if (a + b == 10) {
                if (match.length() != 5) {
                    return "false";
                } else {
                    matched = true;
                }
            }
        }
        return matched ? "true" : "false";
	}
	
}
