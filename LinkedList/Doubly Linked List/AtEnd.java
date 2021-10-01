import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node prev;
}

class List1{
	Node newnode, temp, head =null, tail = null;
	
	public void ins_end(int x){
		newnode = new Node();
	
		newnode.data = x;
		newnode.prev = null;
		newnode.next = null;

		if(head == null){
			head = tail = newnode;
		}else{
			tail.next = newnode;
			newnode.prev = tail;
			tail = newnode;
		}
	}

	public void del_end(){
		if(head == null){
			System.out.println("Linked list is empty!\n");
		}else if(head.next == null){
			head = tail =null;
			System.out.println("Node is deleted!\n");
		}else{
			tail.prev.next = null;
			tail = tail.prev;
			System.out.println("Node is deleted!\n");
		}
	}

	public void show(){
		if(head == null){
			System.out.println("Linked list is empty!\n");
		}else{
			temp = head;

			while(temp != null){
				System.out.println("Element is :" + temp.data);
				temp = temp.next;
			}
		}
	}
}

public class AtEnd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		List1 list = new List1();

		int val, ch;

		do{
			System.out.println("\n 1.Insert\n 2.Delete\n 3.Traverse\n 4.Exit\n");
			System.out.println("Enter your choice:\n");
			ch = scan.nextInt();

			switch(ch){
				case 1:
					System.out.println("Enter data to insert:\n");
					val = scan.nextInt();
					list.ins_end(val);
					break;

				case 2:
					list.del_end();
					break;

				case 3:
					list.show();
					break;

			}
			
		}while(ch != 4);
	}
}