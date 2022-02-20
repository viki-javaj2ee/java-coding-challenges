package com.ds.stack;

import java.util.Scanner;

public class StackUsingArray {

	private int[] stackArray;
	private int top;

	public StackUsingArray() {
		stackArray = new int[10];
		top = -1;
	}

	public StackUsingArray(int maxSize) {
		stackArray = new int[maxSize];
		top = -1;
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == stackArray.length - 1);
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stck overflow.");
			return;
		}
		top = top + 1;
		stackArray[top] = value;
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("Stck underflow.");
			throw new StackException("Empty Stack.");
		}

		int value = stackArray[top];
		top--;

		return value;
	}

	public int peek() {

		if (isEmpty()) {
			System.out.println("Stck underflow.");
			throw new StackException("Empty Stack.");
		}
		return stackArray[top];
	}
	
	public void display() {
		
		if (isEmpty()) {
			System.out.println("Stck is empty.");
			return;
		}
		
		System.out.println("Stack is : ");
		for (int i=0;i<=top;i++) {
			System.out.println(stackArray[i]);
		}
		System.out.println("\n");
	}

}
