package com.ds.stack;

public class StackUsingArrayList {

	private Node top;

	public StackUsingArrayList() {
		top = null;
	}

	public int size() {
		int size = 0;
		Node n = top;

		while (n != null) {
			n = n.link;
			size++;
		}
		return size;
	}

	public void push(int value) {
		Node temp = new Node(value);
		temp.link = top;
		top = temp;
	}

	public int pop() {
		int value;
		if (isEmpty()) {
			System.out.println("Stack underflow...");
			throw new StackException("Stack undeflow.");
		}

		value = top.info;
		top = top.link;
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack underflow...");
			throw new StackException("Stack undeflow.");
		}
		return top.info;
	}

	public boolean isEmpty() {
		return (top == null);
	}
	
	public void display() {
		Node n = top;
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return;
		}
		System.out.println("Stack is : ");
		while (n != null) {
			System.out.println(n.info+" ");
			n = n.link;
		}
		
	}

}
