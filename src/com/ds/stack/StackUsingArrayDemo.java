package com.ds.stack;

import java.util.Scanner;

public class StackUsingArrayDemo {

	public static void main(String[] args) {
		System.out.println("Inside StackDemo...");
		
		int choice,value;
		Scanner scan = new Scanner(System.in);

		StackUsingArray arr = new StackUsingArray(10);
		
		while (true) {
			System.out.println("1. Push an element on the stack");			
			System.out.println("2. Pop an element on the stack");
			System.out.println("3. Display the top element");
			System.out.println("4. Display all stack elements");
			System.out.println("5. Display size of the stack");
			System.out.println("6. Quit");
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();
			
			if (choice == 6)
				break;
			
			switch(choice) {
			case 1:
				System.out.println("Enter the element to be pushed : ");
				value = scan.nextInt();
				arr.push(value);
				break;
			case 2:
				value=arr.pop();
				System.out.println("Popped element is : "+ value);
				break;
			case 3:
				System.out.println("Element at the top is : "+ arr.peek());
				break;
			case 4:
				arr.display();
				break;
			case 5:
				System.out.println("Size of stack : "+ arr.size());
				break;
			default:
				System.out.println("Wrong choice.");
			}//end of switch
			System.out.println(" ");
		}//end of while
		
		scan.close();

	}

}
