import java.util.Scanner; 

class Node{
	int data;
	Node next;
}

class CircularList1{
	Node newnode, temp, prenode;
	Node head =null;

	public void add(int x){
		newnode = new Node();
		newnode.data =x;
		
		if(head == null){
			head = newnode;
			newnode.next = head;
		}else{
			temp = head;

			while(temp.next != head){
				temp = temp.next;
			}

			temp.next = newnode;
			newnode.next = head;
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
				prenode = temp;
				temp = temp.next;
			}

			prenode.next = temp.next;
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

public class AtEnd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		CircularList1 list = new CircularList1();

		int ch, data;

		do{
			System.out.println("\n 1.Insert at end\n 2.Delete at end\n 3.Show\n 4.Exit");
			System.out.print("\n Enter your choice:\n");
			ch = scan.nextInt();

			switch(ch){
				case 1:
					System.out.println("Enter data to insert:\n");
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