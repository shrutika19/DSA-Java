import java.util.Scanner;

class Node{
	int data;
	Node next;
}

class Circular{
	Node newnode, temp, nextnode;
	Node head = null;
	int count = 0, pos, i=0;

	Scanner scan = new Scanner(System.in);

	public void add(int x){
		if(head == null){
			newnode = new Node();
			newnode.data = x;
			head = newnode;
			newnode.next = newnode;
			count++;
		}else{
			System.out.println("Enter a position to insert node:");
			pos = scan.nextInt();
	
			if(pos > count){
				System.out.println("\n Node cannot be inserted at this location!");
			}else{
				newnode = new Node();
				newnode.data = x;
				temp = head;

				while( i < pos){
					temp = temp.next;
					i++;
				}

				newnode.next = temp.next;
				temp.next = newnode;
				count++;
			}

		}
		System.out.println("\n Node is inserted!");
		System.out.println(" Total number of node is:" +count);
	}
	
	public void remove(){
		if(head == null){
			System.out.println(" Linked list is empty!");
		}else if(count == 1){
			temp = head;
			head = null;
			count--;
			System.out.println("\n Node is deleted!");
			System.out.println(" Total number of node is:" +count);
		}else{
			System.out.println("Enter position to delete node:");
			pos = scan.nextInt();

			if(pos > count){
				System.out.println("\n Enter valid location!");
			}else{
				temp = head;

				while( i < pos){
					temp = temp.next;
					i++;
				}

				nextnode = temp.next;
				temp.next = nextnode.next;
				count--;
				System.out.println("\n Node is deleted!");
				System.out.println(" Total number of node is:" +count);
			}
		}
		
	}

	public void show(){
		temp = head;

		if(head == null){
			System.out.println("\n Linked list is empty!\n");
		}else{
			while(temp.next != head){
				System.out.println(" Element is :" +temp.data);
				temp = temp.next;
			}
		     	System.out.println(" Element is :" +temp.data);
		}	
	}
}

public class AtMid{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Circular list = new Circular();
	
		int data, ch;

		do{
			System.out.println("\n 1.Insertion at specific position\n 2.Deletion at specific position\n 3.Show\n 4.Exit\n");
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
			
		}while(ch!=4);
	}
}