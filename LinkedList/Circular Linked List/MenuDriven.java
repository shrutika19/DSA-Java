import java.util.Scanner;

class Node{
	int data;
	Node next;
}

class CircularLinkedList{
	Node newnode, temp, prenode, nextnode;
	Node head = null;

	Scanner scan = new Scanner(System.in);

	public void ins_beg(int x){
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

		System.out.println("\n Node is inserted!");
	}
	
	public void ins_end(int x){
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

			temp.next = newnode;
			newnode.next = head;
		}

		System.out.println("\n Node is inserted!");
	}	
	
	

	public void del_beg(){
	
		temp = head;
		
		if(head == null){
			System.out.println("\n Linked list is empty!");
		}else if(temp.next== head){
			head = null;
			System.out.println("\n Node is deleted!");
		}else{
			while(temp.next != head){
				temp = temp.next;
			}

			temp.next = head.next;
			head = temp.next;
			System.out.println("\n Node is deleted!");
		}
	}

	public void del_end(){
		
		temp = head;
			
		if(head == null){
			System.out.println("\n Linked list is empty!");
		}else if(temp.next== head){
			head = null;
			System.out.println("\n Node is deleted!");
		}else{
			while(temp.next != head){
				prenode = temp;
				temp = temp.next;
				
			}
			prenode.next = temp.next;
			System.out.println("\n Node is deleted!");
		}
	}


	public void show(){
		if(head == null){
			System.out.println("\n Linked list is empty!");
		}else{
			temp = head;

			while(temp.next != head){
				System.out.println(" Element is :" +temp.data);
				temp = temp.next;
			}
			System.out.println(" Element is :" +temp.data);
		}
	}
}

class MenuDriven{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		CircularLinkedList list = new CircularLinkedList();

		int data, ch;

		do{
			System.out.println("\n 1.Insertion at beginning.\n 2.Insertion at End\n"+ 
            			" 3.Deletion at beginning.\n 4.Deletion at End\n" 
            			+" 5.Traverse.\n 6.Exit");
           			 System.out.println("\n Enter your choice:");
           			 ch  = scan.nextInt();

			switch(ch){
				case 1:
					System.out.println("Enter data to insert at beginning:");
					data = scan.nextInt();
					list.ins_beg(data);
					break;

				case 2:
					System.out.println("Enter data to insert at end:");
					data = scan.nextInt();
					list.ins_end(data);
					break;
	
				case 3:
					list.del_beg();
					break;

				case 4:
					list.del_end();
					break;

				case 5:
					list.show();
					break;
			}

		}while(ch != 6);
	}
}