import java.util.Scanner;

public class ArrayAdd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Size of Array:");
		int size = scan.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter " +size+ " Array Elements:");
		for(int  i = 0; i<size; i++){
			arr[i] = scan.nextInt();
		}

		int sum =0;

		for(int  i = 0; i<size; i++){
			sum = sum + arr[i];
		}

		System.out.println("Addition of  Array Elements is:" + sum);

	}
}