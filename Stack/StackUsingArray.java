import java.util.Scanner;

class StackClass{
	
	int max;
	int data[];
	int top;

	public StackClass(int size){
		this.max = size;
		this.top = -1;
		this.data = new int[size]; 
	}

	public boolean isEmpty(){
		return (top == -1);
	}

	public boolean isFull(){
		return (top == max-1);
	}

	public void push(int x){
		top++;
		data[top] = x;
	}

	public int pop(){
        
        		int y;
        		if(isEmpty()){
            			System.out.println("Stack UnderFlow!");
            			return -1;
            
        		}else{
             			y = data[top];
            			top--;
            			return y;
        		}
          }

	public void show(){
        		int i;
        
        		if(isEmpty()){
            			System.out.println("Stack is Empty!");
        		}else{
        
            			for(i = top; i>=0; i--){
                			System.out.println("Stack Elements:" +data[i]);
            			}
        		}
   	 }
}

public class StackUsingArray{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int choice;

		System.out.println("Enter Maximum Size of Stack:\n");
		int max = scan.nextInt();
		StackClass s = new StackClass(max );

		do{
		
		System.out.println("\n1.Push\n  2.Pop\n 3.Show\n 4.Exit\n");
		System.out.println("Enter Your Choice:\t\n");
		choice = scan.nextInt();

		switch(choice){
			case 1:
				if(s.isFull()){
					System.out.println("Stack OverFlow!");
				}else{
				   	System.out.println("Enter Element to Insert:");
					int pushEle = scan.nextInt();
					s.push(pushEle);
				}
					break;
			
			case 2:
				int poppedEle = s.pop();
				break;

			case 3:
				s.show();
				break;

		}
		
		}while(choice != 4);
	}
}