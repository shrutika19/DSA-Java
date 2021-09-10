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
			head = newnode;	
			newnode.next = null;
		}else{
			newnode.next = head;
			head = newnode;
		}
	}

	public void remove(){
		
		if(head  == null){
			System.out.println("Linked list is empty!!");
		}else{
			Node n;
			n = head;
			head = n.next;
			System.out.println("Node is deleted!!");			
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

public class AtBeginning{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int choice, value;
		LinkedList list = new LinkedList();

		do{
			System.out.println("\n  1.Insertion at beginning\n  2.Deletion at beginning\n  3.Show\n  4.Exit\n");
			System.out.println("Enter your choice:\n");
			choice = scan.nextInt();
		
			switch(choice){
				case 1:
					System.out.println("Enter any element:");
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

		}while(choice!=4);
	}
}