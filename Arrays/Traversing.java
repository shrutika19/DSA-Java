//java program to traverse the array elements

import java.util.Scanner;

public class Traversing{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Array Elemennts:");
		int size = scan.nextInt();
		
		int[] arr =  new int[size];

		System.out.println("Enter " +size+ " Array Elements:");
		for(int i=0; i<size; i++){
			arr[i] = scan.nextInt();
		}

		System.out.println("Array Elements are:");
		for(int i=0; i<size; i++){
			System.out.println(arr[i]);
		}

	}
}