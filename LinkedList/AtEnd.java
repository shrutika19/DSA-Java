import java.util.Scanner;

class Node{
	int data;
	Node next;
}

class LinkedList{
	Node head = null;

	public void add(int d){
		Node newnode = new Node();
		newnode.data = d;

		if(head == null){
			newnode.next = null;
			head = newnode;
		}else{
			Node temp = head;

			while(temp.next != null){
				temp = temp.next;
			}

			temp.next = newnode;
			newnode.next = null;
		}
	}

	public void remove(){
		Node temp, prevnode=null;
		temp = head;

		while(temp.next != null){
			prevnode = temp;
			temp = temp.next;
		}

		if(temp == head){
			head = null;
		}else{
			prevnode.next = null;
		}

		
	}

	public void show(){
		if(head  == null){
			System.out.println("Linked list is empty!!");
		}else{
			Node temp = head;
			while(temp.next != null){
			System.out.println("Element is :" +temp.data);
			temp = temp.next;
		}
		              System.out.println("Element is :" +temp.data);
		}
	
	}
}

public class AtEnd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int ch ,  value;
		LinkedList list = new LinkedList();

		do{
			System.out.println("\n 1.Insertion at End\n 2.Deletion at End\n 3.Show\n 4.Exit\n");
			System.out.println("Enter your choice:");
			ch = scan.nextInt();

			switch(ch){
				case 1:
					System.out.println("Entet any Elemenet:");
					value = scan.nextInt();
					list.add(value);
					break;
				case 2:
					list.remove();
					break;

				case 3:
					list.show();
					break;
					
			}
		}while(ch != 4);
	}
}