import java.util.Scanner;

class CircularQueue{
	
	int rear, front, size;
	int data[];

	public CircularQueue(int size){
		this.rear = -1;
		this.front = -1;
		this.size = size;
		this.data = new int[size];
	}

	public void cqEnqueue(int x){
		
		//Circular Queue Full Condition
		if( (rear + 1) % size == front){
			System.out.println("Circular Queue is Full!");
		}else if( rear == -1 && front == -1){
			rear = 0;
			front = 0;
			data[rear] = x;
		}else if(rear == size - 1 && front != 0){
			rear = 0;
			data[rear] = x;
		}else{
			rear = (rear + 1) % size;
			data[rear] = x;
		}
	}

	public void cqDeueue(){
		
		int x;
		
		//Circular Queue Empty condition
		if(rear == -1 && front == -1){
			System.out.println("Circular Queue is Empty!");
		}else{
			x = data[front];
			System.out.println(x +" is deleted!");
			
			if( front == rear){
				front = -1;
				rear = -1;
			}else{
				front = (front + 1) % size;
			}
		}
	}

	public void display(){

		int i = front;

		if(rear == -1 && front == -1){
			System.out.println("Circular Queue is Empty!");
		}else{
			
			while(i != rear){
				System.out.println("Circular Queue Element is: " +data[i]);
				i = (i + 1) % size;	
			}
			
			System.out.println("Circular Queue Element is: " +data[rear]);
		}
		
	}
}

public class CircularQueueArray{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int choice, newElement;

		System.out.println("Enter size of Circular Queue:\n");
		int size = scan.nextInt();
		CircularQueue cq = new CircularQueue(size);

		do{
		
			System.out.println("\n 1.Enqueue\n 2.Dequeue\n 3.Display\n 4.Exit\n");
			System.out.println("Enter Your Choice:\n");
			choice = scan.nextInt();

			switch(choice){
			
				case 1:
					System.out.println("Enter Element to insert:");
					newElement =  scan.nextInt();
					cq.cqEnqueue(newElement);
					break;

				case 2:
					cq.cqDeueue();
					break;
		
				case 3:
					cq.display();
					break;
						
			}
		}while( choice != 4);	
		

	}
}