import java.util.Scanner;

class QueueClass{

	int maxSize;
	int rear, front;
	int data[];

	public QueueClass(int size){
		this.maxSize = size;
		this.rear = -1;
		this.front = -1;
		this.data = new int[size];	
	}

	public boolean isEmpty(){
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}

	public boolean isFull(){
		if(rear == maxSize-1)
			return true;
		else
			return false;
	}

	public void enqueue(int element){
		
		if(isEmpty()){
			rear = 0;
			front =0;
			data[rear] = element;
		}else{
			rear++;
			data[rear] = element;
		}
	}

	public int dequeue(){
		
		int y = data[front];	

		if(rear == front){
			rear = -1;
			front = -1;
			return y;
		}else{
			front++;
			return y;
		}
			
	}

	public void show(){

		if(isEmpty()){
			System.out.println("Queue is Empty!");
		}else{
			for(int  i = front; i <= rear; i++ ){
				System.out.println("Queue Elements are:\n" +data[i]);
			}
		}
	}
}

class QueueUsingArray{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int choice;

		System.out.println("Enter maximum size of Queue:");
		int size = scan.nextInt();

		QueueClass q = new QueueClass(size);

		do{
	
			System.out.println("1.Enqueue\n 2.Dequeue\n 3.Show\n 4.Exit\n");
			System.out.println("Enter Your Choice:\n");
			choice = scan.nextInt();

			switch(choice){
				
				case 1:
					if(q.isFull()){
						System.out.println("Queue is Full!");
					}else{
						System.out.println("Enter Element to insert:\n");
						int newElement = scan.nextInt();
						q.enqueue(newElement);
					}
					break;

				case 2:
					if(q.isEmpty()){
						System.out.println("Queue is Empty!");
					}else{
						int deletedElement = q.dequeue();
					}
					break;

				case 3:
					q.show();
					break;
			}
		
		}while(choice != 4);
	}
}