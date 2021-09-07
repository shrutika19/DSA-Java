import java.util.Scanner;

public class BubbleSort{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int arr[] = new int[100];
		int i, j, temp;

		System.out.println("Enter Size of Array:");
		int size = scan.nextInt();

		System.out.println("Enter " +size+ " of Array Elements:");
		for(i =0; i<size; i++)
			arr[i] = scan.nextInt();

		
		for(i = 0; i < size-1; i++)
			for(j=0; j < size-1-i; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}


		System.out.println("Sorted Elements are");
		for(i =0; i<size; i++)
			System.out.println(arr[i]);	
	}
}