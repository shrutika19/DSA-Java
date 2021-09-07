import java.util.Scanner;

public class InsertionSort{
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int arr[] = new int[100];
		int size, i, j, temp;

		System.out.println("Enter size of Array:");
		size = scan.nextInt();

		System.out.println("Enter " +size+ " of Array:" );
		for(i = 0; i<size; i++){
			arr[i] = scan.nextInt();
		}

		for(i = 1; i<size; i++){
			temp = arr[i];
			j = i-1;

		while(j >=0 && arr[j] > temp){
			arr[j+1] = arr[j];
			j = j-1;
		}
			arr[j+1] = temp;
		}

		System.out.println("Sorted Elements are:");
		for(i = 0; i<size; i++){
			System.out.println(arr[i]);
		}
	}
}