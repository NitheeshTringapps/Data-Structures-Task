package com.basic;

import java.util.*;
/**
 * 
 * @author Nitheesh
 * Node class creates a node for an LinkedList
 *
 */
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}

/**
 * 
 * @author Nitheesh
 * class LinkedList gives the implementation of linkedList
 *
 */
public class LinkedList {
	
	static Scanner sc = new Scanner(System.in);
	static Node head;
	
	/**
	 * inserts an element into the first position of LinkedList
	 */
	private static void beginsert() {
		System.out.println("Enter the Number: ");
		Node newNode = new Node(sc.nextInt());
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		System.out.println("Node Inserted!");
	}
	
	/**
	 * inserts an element into the last position of LinkedList
	 */
	private static void lastinsert() {
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
		System.out.println("Node Inserted!");
	}
	
	/**
	 * inserts an element into the required position of LinkedList as per the user's need
	 */
	private static void randominsert() {
		System.out.println("Enter the Number: ");
		Node newNode = new Node(sc.nextInt());
		Node temp = head;
		System.out.println("Enter the location after which you want to insert: ");
		int location = sc.nextInt();
		for(int i = 1; i < location; i++) {
			temp = temp.next;
			if(temp == null) {
				System.out.println("Can't Insert!");
				return;
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println("Node Inserted!");
	}
	
	/**
	 * Deletes an element from the first position of LinkedList
	 */
	private static void begin_delete() {
		if(head == null) {
			System.out.println("Linked List is empty!");
		}
		else {
			head = head.next;
			System.out.println("Node Deleted!");
		}
	}
	
	/**
	 * Deletes an element from the last position of LinkedList
	 */
	private static void last_delete() {
		if(head == null) {
			System.out.println("Linked List is empty!");
		}
		else if(head.next == null) {
			head = null;
			System.out.println("Node Deleted!");
		}
		else {
			Node temp = head;
			Node temp1 = null;
			while(temp.next != null) {
				temp1 = temp;
				temp = temp.next;
			}
			temp1.next = null;
			System.out.println("Node Deleted!");
		}
	}
	
	/**
	 * Deletes an element from the required position of LinkedList as per the user's need
	 */
	private static void random_delete() {
		Node temp = head;
		Node temp1 = null;
		System.out.println("Enter the location which you want to delete: ");
		int location = sc.nextInt();
		for(int i = 1; i < location; i++) {
			temp1 = temp;
			temp = temp.next;
			if(temp == null) {
				System.out.println("Can't Delete!");
				return;
			}
		}
		temp1.next = temp.next;
		System.out.println("Node Deleted!");
	}
	
	/**
	 * Searches an element's position from the linkedList
	 */
	private static void search() {
		if(head == null) {
			System.out.println("Linked List is empty!");
		}
		else {
			System.out.println("Enter the element you want to Search: ");
			int value = sc.nextInt();
			Node temp = head;
			int i = 0, flag = 0;
			while(temp != null) {
				if(temp.data == value) {
					System.out.println("Item found at location: " + (i+1));
					flag = 1;
				}
				i++;
				temp = temp.next;
			}
			if(flag == 0) {
				System.out.println("Item not Found!");
			}
		}
	}
	
	/**
	 * Displays all the elements present in the linkedList
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
	 * Allows an user to create a linkedList and perform its various methods
	 */
	public static void main(String[] args) {
		
		int choice =0;  
	    while(choice != 9)   
	    {  
	        System.out.println("Choose one option from the following to perform actions for LinkedList");  
	        System.out.println("===============================================");  
	        System.out.println("1.Insert in begining\n2.Insert at last\n3.Insert at any random location\n4.Delete from Beginning"); 
	        System.out.println("5.Delete from last\n6.Delete node after specified location\n7.Search for an element\n8.Show\n9.Exit\n");  
	        System.out.println("\nEnter your choice?\n");         
	        choice = sc.nextInt(); 
	        switch(choice)  
	        {  
	            case 1:  
	            	beginsert();      
	            	break;  
	            case 2:  
	            	lastinsert();         
	            	break;  
	            case 3:  
	            	randominsert();       
	            	break;  
	            case 4:  
	            	begin_delete();       
	            	break;  
	            case 5:  
	            	last_delete();        
	            	break;  
	            case 6:  
	            	random_delete();          
	            	break;  
	            case 7:  
	            	search();         
	            	break;  
	            case 8:  
	            	display();        
	            	break;  
	            case 9:  
	            	System.out.println("Exited");
	            	break;  
	            default:  
	            	System.out.println("Please enter valid choice..");  
	        }  
	    }  
	}
}
