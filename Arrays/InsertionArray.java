//java program to insert an element at specific position in array

import java.util.Scanner;

class DisplayData{
	static void show(int arr[], int size){
		for(int i =0 ; i<size; i++){
			System.out.println(arr[i]);
		}
		
	}

	void insert(int arr[], int sizeArr, int position, int element){
		if(position > sizeArr || position <=0)
			System.out.println("Error! Array Index Outof Bound!");
		else{
			for(int i = sizeArr-1; i >= position; i--){
				arr[i+1]= arr[i];
			}
			arr[position] = element;
			sizeArr++;
			System.out.println("New Array Elements are:");
			show(arr, sizeArr);
				
		}
	}
}

public class InsertionArray{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter size of Array:");
		int size = scan.nextInt();

		int arr[] = new int[100];

		System.out.println("Enter " +size+ " Array Elements:");
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();
		}


		System.out.println("Enter Element to be inserted:");
		int ele = scan.nextInt();

		System.out.println("Enter Postion in Array for insertion:");
		int pos = scan.nextInt();
		pos-=1;                   // Because Arrays starts from 0
		
		DisplayData obj1 = new DisplayData();
		System.out.println("Original Array Elements are:" );
		obj1.show(arr,size);
		obj1.insert(arr, size, pos, ele);
		
	}
}