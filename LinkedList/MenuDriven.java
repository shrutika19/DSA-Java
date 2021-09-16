import java.util.Scanner;

class Node{
	int data;
	Node next;
}

class LinkedList1{
	Node temp, newnode, nextnode, prevnode;
	Node  head = null;

	public int count = 0, pos;
	Scanner scan = new Scanner(System.in);
	
	public void insert_beg(int x){
		newnode = new Node();
		newnode.data =x;
		
		if(head == null){
			newnode.next = null;
			head = newnode;
		}else{
			newnode.next = head;
			head = newnode;
		}
		count++;
		System.out.println("Total number of nodes:" + count);
		
	}

	public void insert_end(int x){
		
		if(head == null){
			System.out.println("Cannot inserted node!");	
		}else{
			newnode = new Node();
			newnode.data =x;
			
			temp =  head;

			while(temp.next != null){
				temp = temp.next;
			}

			temp.next = newnode;
			newnode.next = null;
			count++;
			System.out.println("Total number of nodes:"+count);
		}
	}

	public void insert_pos(int x){

		if(head == null){
            			System.out.println("Can not inserted node!");
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

	public void del_beg(){
		if(head  == null){
			System.out.println("Linked list is empty!");
		}else{
			temp = head;
			head = temp.next;
			System.out.println("Node is deleted!");
            			count--;
            			System.out.println("Total number of nodes: " +count);
		}	
	}

	public void del_end(){
		if(head  == null){
			System.out.println("Linked list is empty!");
		}else{
			temp = head;

			while(temp.next != null){
				prevnode = temp;
				temp = temp.next;
			}

			if(head == temp){
				head  = null;
			}else{
				prevnode.next = null;
			}
			 System.out.println("Node is deleted!");
             			count--;
             			System.out.println("Total number of nodes: " +count);
		}
	}

	public void del_pos(){
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
		System.out.println("Total number of nodes: " +count);
            }
        }	
}

	public void traverse(){
		if(head  == null){
			System.out.println("Linked list is empty!");
		}else{
			temp = head;
			
			while(temp.next != null){
				System.out.println("Element is: " +temp.data);
				temp = temp.next;
			}
			System.out.println("Element is: " +temp.data);
		}
	}
	
}

public class MenuDriven{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int ch, data;
		LinkedList1 list = new LinkedList1();

		do{
			System.out.println("\n 1.Insertion at beginning.\n 2.Insertion at End\n 3.Insertion at specific location.\n"+
            			" 4.Deletion at beginning.\n 5.Deletion at End\n 6.Deletion at specific location.\n"
            			+" 7.Traverse.\n 8.Exit");
           			 System.out.println("\n Enter your choice:");
           			 ch  = scan.nextInt();
			
			switch(ch){
			case 1:
				System.out.println("Enter data to insert into node:");
				data = scan.nextInt();
				list.insert_beg(data);
				break;
			case 2:
				System.out.println("Enter data to insert into node:");
				data = scan.nextInt();
				list.insert_end(data);
				break;
			case 3:
				System.out.println("Enter data to insert into node:");
				data = scan.nextInt();
				list.insert_pos(data);
				break;
			case 4:
				list.del_beg();
				break;
			case 5:
				list.del_end();
				break;
			case 6:
				list.del_pos();
				break;
			case 7:
				list.traverse();
				break;
		        }
		}while(ch != 8);

		
	}
}

