import java.util.Scanner;

class Node{
	int data;
	Node next;
}
class List{
	Node head  = null;
	Node newnode, temp, nextnode;
	public int count = 0;
	int pos, i;
	Scanner scan  = new Scanner(System.in);

	 public void add(int x){
        		if(head == null){
            			newnode = new Node();
			newnode.data = x;
			count++;
			System.out.println("Number of nodes: " +count);
			newnode.next = null;
			head = newnode;
       		 }else{
            			System.out.println("Enter location to insert node:");
            			pos = scan.nextInt();
            
            		if(pos >= count){
                			System.out.println("Enter valid location!");
            		}else{
                			temp = head;
                
               			 for(int i = 1; i < pos-1; i++){
                    			temp = temp.next;
                			}
                
                		newnode = new Node();
                		newnode.data = x;
                		newnode.next = temp.next;
               		 temp.next = newnode;
                		count++;
                		System.out.println("Total number of nodes: " +count);
            }
        }
    }	

	public void remove(){
        		if(head == null){
            			System.out.println("Linked list is empty!");
        		}else{
            			System.out.println("Enter location to delete node:");
           			pos = scan.nextInt();
            
            		if(pos > count){
                			System.out.println("Enter valid location!");
            		}else{
                			temp = head;
                
                			for(int i = 1; i < pos-1; i++){
                    			temp = temp.next;
                			}
                
                nextnode = temp.next;
                temp.next = nextnode.next;
                count--;
                System.out.println("Node is deleted!");
            }
        }
    }
	public void show(){
		if(head == null){
			System.out.println("Linked list is empty!");
		}else{
			Node temp = head;

			while(temp.next != null){
				System.out.println("Element is : " +temp.data);
				temp = temp.next;
			}
			System.out.println("Element is : " +temp.data);
		}
	}
}

public class AtMid{
 	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int ch, data;
		List list = new List();
	
		do{
			System.out.println("\n 1.Insertion at specific position.\n 2.Deletion at specific position\n 3.Show\n 4.Exit\n");
			System.out.println("Enter your choice:\n");
			ch = scan.nextInt();

			switch(ch){
				case 1:
					System.out.println("Enter data to insert into node:\n");
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