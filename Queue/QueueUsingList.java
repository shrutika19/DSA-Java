import java.util.Scanner;

class Node{
	int data;
	Node next;
}

class ListQueue{
	Node newnode, front =null, rear = null, temp;
	
	public void enqueue(int x){
		newnode = new Node();

		newnode.data = x;
		newnode.next =null;

		if(front == null){
			rear = newnode;
			front = newnode;
		}else{
			rear.next = newnode;
			rear = newnode;
		}
	}

	public void dequeue(){
		if(front == null){
			System.out.println("Queue is Empty!");
		}else{
			temp = front;
			
			front = front.next;
			System.out.println("Node is deleted!");		
		}
	}
	
	public void show(){
		temp = front;

		if(front == null){
			System.out.println("Queue is empty!");
		}else{
			while(temp != null){
				System.out.println("Element is :" + temp.data);
				temp = temp.next;
			}
		}
	}

}

public class QueueUsingList{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		ListQueue list = new ListQueue();
		
		int data, ch;

		do{
			System.out.println("\n 1.Enqueue\n 2.Dequeue\n 3.Show\n 4.Exit\n");
			ch = scan.nextInt();

			switch(ch){
				case 1:
					System.out.println("Enter data to insert:");
					data = scan.nextInt();
					list.enqueue(data);
					break;

				case 2:
					list.dequeue();
					break;

				case 3:
					list.show();
					break;
	
			}
		}while(ch != 4);
	}
}