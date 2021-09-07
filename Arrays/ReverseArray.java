import java.util.Scanner;

public class ReverseArray{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size  = scan.nextInt();

		System.out.println("Enter " + size+ " Array Elements:" );
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = scan.nextInt();
		}

		System.out.println("Reverse Array Elements are:");
		for(int i = size-1; i>=0; i--){
			System.out.println(arr[i]);
		}	
	}
}