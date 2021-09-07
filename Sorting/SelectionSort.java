import java.util.Scanner;

public class SelectionSort{
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		
		int i, j, min, temp;
		int arr[] = new int[100];

		System.out.println("Enter Size of Array:");
		int size = scan.nextInt();

		System.out.println("Enter " +size+ " of Array Elements:");
		for(i =0; i<size; i++)
			arr[i] = scan.nextInt();	

		for(i = 0;  i< size-1; i++){
			min = i;
			for(j = i+1; j< size; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		System.out.println("Sorted Elements are");
		for(i =0; i<size; i++)
			System.out.println(arr[i]);		

	}
}