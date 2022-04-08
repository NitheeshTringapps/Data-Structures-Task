package basic;

import java.util.*;

/**
 * 
 * @author Nitheesh
 * class Stack gives the implementation of Stack
 *
 */
public class Stack {
	static Scanner sc = new Scanner(System.in);
	static Node head;
	
	/**
	 * Pushes an element into the Stack
	 */
	private static void push() {
		System.out.println("Enter the Number: ");
		Node newNode = new Node(sc.nextInt());
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		System.out.println("Pushed : " + newNode.data);
	}
	
	/**
	 * pops an element from the Stack
	 */
	private static void pop() {
		int data = head.data;
		head = head.next;
		System.out.println("Popped : " + data);
	}
	
	/**
	 * @return the top of the stack
	 */
	private static int peek() {
		return head.data;
	}
	
	/**
	 * displays all the elements in the stack
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
	 * Allows an user to create a Stack and perform its various methods
	 */
	public static void main(String[] args) {
		 int choice = 0; 
		 while(choice != 4)  {  
			 System.out.println("\nChoose one option from the following to perform actions for Stack");  
			 System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
			 System.out.println("\n Enter your choice \n");        
		     choice = sc.nextInt(); 
		     switch(choice){  
		          case 1:  
		          {   
		              push();  
		              break;  
		          }  
		          case 2:  
		          {  
		              pop();  
		              break;  
		          }  
		          case 3:  
		          {  
		              display();  
		              break;  
		          }  
		          case 4:   
		          {  
		          	  System.out.println("Exited");  
		              break;   
		          }  
		          default:  
		          {  
		          	System.out.println("Please Enter valid choice ");  
		          }   
		    }
		}
	}
}
