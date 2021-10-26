//creation of binary tree in java

import java.util.Scanner;

class Node{

	int data, x;
	Node left;
	Node right;

	Node root = null;

	Scanner scan = new Scanner(System.in);

	public Node create(){
		System.out.println("Enter data:(Press -1 to exit)");
		x = scan.nextInt();

		if(x == -1){
			return null;
		}else{
			Node newnode = new Node();

			newnode.data =x;

			System.out.println("Enter left child of "+x);
			newnode.left = newnode.create();

			System.out.println("Enter right child of "+x);
			newnode.right = newnode.create();
			
			return newnode;
		}
	}

	public void show(Node temp){
		if(temp != null){
			System.out.println(temp.data);
			show(temp.left);
			show(temp.right);
		}
	}
}


public class BinaryTreeCreation{
	public static void  main(String args[]){
		Node node = new Node();

		Node root = node.create();

		System.out.println("Tree traversing:");
		node.show(root);
	}
}