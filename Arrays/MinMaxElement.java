import java.util.Scanner;

public class MinMaxElement{

	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Size of Array:");
		int size = scan.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter " +size+ "  Array Elements:");
		for(int i=0; i<size; i++){
			arr[i] = scan.nextInt();
		}
			
		int max = arr[0];
		int min = arr[0];

		for(int i =0 ; i< size; i++){
		
			if(min > arr[i])
				min = arr[i];

			if(max < arr[i])
				max= arr[i];

		}

		System.out.println("Minimum Array Element is: " +min);
		System.out.println("Maximum Array Element is: " +max);
	}
}