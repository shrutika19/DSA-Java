//Stack implementation using singly linked list

import java.util.Scanner;

class Node{
	int data;
	Node next;
}

class StackList{
	Node top = null;
	Node newnode;

	public void push(int x){
		newnode = new Node();
		newnode.data = x;
		newnode.next = top;
		top = newnode;
	}

	public void pop(){
		Node temp = top;

		if(top == null){
			System.out.println("Linked list is empty");
		}else{
			top = temp.next;
			System.out.println("Node is deleted");
		}
	}

	public void peek(){
		if(top == null){
			System.out.println("Linked list is empty");
		}else{
			System.out.println("Top element is: " +top.data);
		}
	}

	public void traverse(){
		Node temp = top;

		if(top == null){
			System.out.println("Linked list is empty");
		}else{
			while(temp != null){
				System.out.println(" Element is: " +temp.data);
				temp = temp.next;
			}
		}
	}
}

public class StackUsingLinkedList{
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		int ch ,  data;
		StackList list = new StackList();

		do{
			System.out.println(" 1.Push\n 2.Pop\n 3.Peek\n 4.Traverse\n 5.Exit\n");
			System.out.println(" Enter your choice:\n");
			ch = scan.nextInt();

			switch(ch){
			case 1:
				System.out.println("Enter data to insert:\n");
				data = scan.nextInt();
				list.push(data);
				break;
			case 2:
				list.pop();
				break;
			case 3:
				list.peek();
				break;
			case 4:
				list.traverse();
				break;
			}
		}while( ch != 5);
	}
}

