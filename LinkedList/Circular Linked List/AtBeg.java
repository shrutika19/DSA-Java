import java.util.Scanner;

class Node{
	int data;
	Node next;
}

class CircularList{
	Node newnode, temp;
	Node head = null;

	public void add(int x){
		newnode = new Node();
		newnode.data = x;

		if(head == null){
			head = newnode;
			newnode.next = head;
		}else{
			temp = head;

			while(temp.next != head){
				temp = temp.next;
			}

			newnode.next = head;
			temp.next = newnode;
			head = newnode;
		}

		System.out.println("Node is inserted!");

	}

	public void remove(){
		temp = head;
	
		if(head == null){
			System.out.println("Linked list is empty!\n");
		}else if(temp.next == head){
			head = null;
			System.out.println("Node is deleted!\n");
		}else{
			while(temp.next != head){
				temp = temp.next;
			}

			temp.next = head.next;
			head = temp.next;
			System.out.println("Node is deleted!\n");
		}
	}

	public void show(){
		temp = head;

		if(head == null){
			System.out.println("Linked list is empty!\n");
		}else{
			while(temp.next != head){
			System.out.println("Element is :" +temp.data);
			temp = temp.next;
		}
		     	System.out.println("Element is :" +temp.data);
		}	
	}	
}

public class AtBeg{
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	CircularList list = new CircularList();

	int ch, data;

	do{
		System.out.println("\n 1.Insertion at beginning\n 2.Deletion at beginning\n 3.Show\n 4.Exit\n");
		System.out.println("Enter your choice:");
		ch = scan.nextInt();

		switch(ch){
			case 1:
				System.out.println("Enter data to insert:");
				data = scan.nextInt();
				list.add(data);
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