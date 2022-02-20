package com.ds.queue;

import java.util.Scanner;

import com.ds.stack.StackUsingArray;

public class QueueUsingArrayDemo {

	public static void main(String[] args) {
		
		int choice,value;
		Scanner scan = new Scanner(System.in);

		QueueUsingArray queue = new QueueUsingArray(10);
		
		while (true) {
			System.out.println("1. Insert an element in the queue");			
			System.out.println("2. Delete an element from the queue");
			System.out.println("3. Display element at the front");
			System.out.println("4. Display all elements of the queue");
			System.out.println("5. Display size of the queue");
			System.out.println("6. Quit");
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();
			
			if (choice == 6)
				break;
			
			switch(choice) {
			case 1:
				System.out.println("Enter the element to be inserted : ");
				value = scan.nextInt();
				queue.insert(value);
				break;
			case 2:
				value=queue.delete();
				System.out.println("Popped element is : "+ value);
				break;
			case 3:
				System.out.println("Element at the front is : "+ queue.peek());
				break;
			case 4:
				queue.display();
				break;
			case 5:
				System.out.println("Size of queue is  : "+ queue.size());
				break;
			default:
				System.out.println("Wrong choice.");
			}//end of switch
			System.out.println(" ");
		}//end of while
		
		scan.close();

	}

}
