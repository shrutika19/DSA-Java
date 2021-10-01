import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node prev;
}

class List2{
	Node newnode, temp, head =null, tail = null;

	public void ins_beg(int x){
		newnode = new Node();
	
		newnode.data = x;
		newnode.prev = null;
		newnode.next = null;

		if(head == null){
			head = tail = newnode;
		}else{
			head.prev = newnode;
			newnode.next = head;
			head = newnode;
		}
	}

	public void del_beg(){
		if(head == null){
			System.out.println("Linked list is empty!\n");
		}else if(head.next == null){
			head = tail =null;
			System.out.println("Node is deleted!\n");
		}else{
			head = head.next;
			head.prev = null;
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

public class AtBeg{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		List2 list = new List2();

		int val, ch;

		do{
			System.out.println("\n 1.Insert\n 2.Delete\n 3.Traverse\n 4.Exit\n");
			System.out.println("Enter your choice:\n");
			ch = scan.nextInt();

			switch(ch){
				case 1:
					System.out.println("Enter data to insert:\n");
					val = scan.nextInt();
					list.ins_beg(val);
					break;

				case 2:
					list.del_beg();
					break;

				case 3:
					list.show();
					break;

			}
			
		}while(ch != 4);
	}
}