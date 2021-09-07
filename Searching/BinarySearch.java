import java.util.Scanner;

public class BinarySearch{

	static int iteration(int arr[], int high, int low, int keyEle){
		int mid;

		while(low <= high){
			 mid = (low + high)/2;
			
			if(keyEle == arr[mid])
				return mid;
			else if(keyEle < arr[mid])
				high  = mid -1;
			else
				low = mid +1;
		}
		return -1;
	}

	public static void main(String args[]){
		Scanner scan =  new Scanner(System.in);

		int arr[] = new int[100];
		int temp;

		System.out.println("Enter Size of Array:");
		int size = scan.nextInt();
		int low = 0;
		int high = size -1;

		System.out.println("Enter " +size+ " Array Elements:");
		for(int i =0; i< size; i++){
			arr[i] = scan.nextInt();
		}

		//Code for sorting elements
		for(int pass = 0; pass < size -1; pass++){
			for(int i =0; i<size-pass-1; i++){
				if(arr[i] > arr[i +1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}


		System.out.println("Sorted Array Elements are:");
		for(int i =0;  i< size; i++)
			System.out.println(arr[i]);

		System.out.println("Enter Element you want to search:");
		int key = scan.nextInt();
		
		int result = BinarySearch.iteration(arr, high, low, key);

		if(result == -1)
			System.out.println("Element is not Found!");
		else
			System.out.println("Element is Found! At location:" + (result+1));
	}
}