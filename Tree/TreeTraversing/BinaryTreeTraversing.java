import java.util.Scanner;

class Node{
	int data, x;
	Node left;
	Node right;

	Node root = null;
	Scanner scan = new Scanner(System.in);

	public Node create(){
		Node newnode;

		System.out.println("Enter data: (Press -1)");
		x = scan.nextInt();

		if(x == -1){
			return null;
		}else{
			newnode = new Node();
			newnode.data = x;

			System.out.println("Enter left child of " +x);
			newnode.left  = newnode.create();

			System.out.println("Enter right child of " +x);
			newnode.right  = newnode.create();

			return newnode;
		}
	}

	public void inorder(Node temp){
		if(temp != null){
			inorder(temp.left);
			System.out.println(temp.data);
			inorder(temp.right);
		}
	}

	public void preorder(Node temp){
		if(temp != null){
			System.out.println(temp.data);
			preorder(temp.left);
			preorder(temp.right);
		}
	}

	public void postorder(Node temp){
		if(temp!=null){
			postorder(temp.left);
			postorder(temp.right);
			System.out.println(temp.data);
		}
	}
}

public class BinaryTreeTraversing{
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		Node node = new Node();
		Node root = null;

		int ch;

		do{
			System.out.print("\n 1.Insert\n 2.Inorder\n 3.Preorder\n 4.Postorder\n (Presss -1 to exit):");
			System.out.println("Enter your choice:");
			ch = scan.nextInt();

			switch(ch){
				case -1:
					return;
					//break;

				case 1:
					root = node.create();
					break;

				case 2:
					System.out.println("Inorder Traversing:");
					node.inorder(root);
					break;

				case 3:
					System.out.println("Preorder Traversing:");
					node.preorder(root);
					break;	

				case 4:
					System.out.println("Postorder Traversing:");
					node.postorder(root);
					break;

			}

		}while(ch != 5);
	}
}