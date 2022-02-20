package com.ds.queue;

public class QueueUsingArray {
	
	private int[] queueArray;
	private int front;
	private int rear;
	
	public QueueUsingArray() {
		queueArray = new int[10];
		front = -1;
		rear = -1;
	}

	public QueueUsingArray(int maxSize) {
		queueArray = new int[maxSize];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		return (front==-1 ||  front==rear+1);
	}
	
	public boolean isFull() {
		return (rear == queueArray.length -1);
	}
	
	public int size() {
		if (isEmpty())
			return 0;
		else 
			return rear-front+1;
	}
	
	public void insert(int value) {
		if (isFull()) {
			System.out.println("Queue overflow \n");
			return;
		}
		
		if (front == -1)
			front =0;
		rear = rear+1;
		queueArray[rear] = value;
	}
	
	public int delete() {
		int value;
		if(isEmpty()) {
			System.out.println("Queue underflow.");
			throw new QueueException("Queue undeflow");
		}
		value = queueArray[front];
		front = front+1;
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue underflow.");
			throw new QueueException("Queue undeflow");
		}
		return queueArray[front];
	}
	
	public void display() {
		int value;
		
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println("Queue is : \n\n");
		for(int i=front; i<=rear; i++)
			System.out.println(queueArray[i] +"  ");
		System.out.println();
	}
}
