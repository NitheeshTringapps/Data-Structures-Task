package com.basic;

import java.util.Scanner;

/**
 * 
 * @author Nitheesh
 * class Queue gives the implementation of Queue
 *
 */
public class Queue {
	static Scanner sc = new Scanner(System.in);
	static Node head;
	
	/**
	 * Adds an element into the queue
	 */
	private static void enque() {
		System.out.println("Enter the Number: ");
		Node newNode = new Node(sc.nextInt());
		Node temp = head;
		if(head == null) {
			head = newNode;
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		System.out.println("Added : " + newNode.data);
	}
	
	/**
	 * Removes and elements from the queue
	 */
	private static void deque() {
		int data = head.data;
		head = head.next;
		System.out.println("Removed : " + data);
	}
	
	/**
	 * @return the front element of Queue
	 */
	private static int peek() {
		return head.data;
	}
	
	/**
	 * displays all the elements in the queue
	 */
	private static void display() {
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	
	/**
	 * Allows an user to create a Queue and perform its various methods
	 */
	public static void main(String[] args) {
		 int choice = 0;   
		 while(choice != 4)   { 
			System.out.println("\nChoose one option from the following to perform actions for Queue");  
		    System.out.println("\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");  
		    System.out.println("\nEnter your choice ?");  
		    choice = sc.nextInt();  
		    switch(choice) {  
		        case 1:  
		            enque();  
		            break;  
		        case 2:  
		            deque();  
		            break;  
		        case 3:  
		            display();  
		            break;  
		        case 4:  
		        	System.out.println("Exited");  
		            break;  
		        default:   
		        	System.out.println("\nEnter valid choice??\n");  
		    }  
		 }  
	}
}
