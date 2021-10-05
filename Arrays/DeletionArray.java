#java program to delete specific element from array

import java.util.Scanner;

public class DeletionArray{

	static void showData(int arr[], int size){
		for(int i =0; i<size; i++){
			System.out.println(arr[i]);
		}
	}

	static void delete(int arr[], int size, int pos){
		if(pos >= size || pos <=0)
			System.out.println("Error! Array Index outof Bound!");
		else{
			for(int i = pos; i <=size; i++ ){
				arr[i] = arr[i+1];
			}
			size--;
			System.out.println("New Array Elements are:");
			DeletionArray.showData(arr,size);

		}

	
}

	

	public static void main(String args[]){
		Scanner scan  = new Scanner(System.in);
		int arr[] = new int[100];

		System.out.println("Enter size of Array:");
		int size = scan.nextInt();

		System.out.println("Enter " +size+ " Array Element:");
		for(int i = 0; i<size; i++){
			arr[i] = scan.nextInt();
		} 

		System.out.println("On which position you want to delete element");
		int pos =  scan.nextInt();
		pos-=1;

		System.out.println("Original Array Elements are:");
		DeletionArray.showData(arr, size);
		DeletionArray.delete(arr, size, pos);

		
	}
}