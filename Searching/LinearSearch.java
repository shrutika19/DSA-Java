import java.util.Scanner;

public class LinearSearch{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int flag=0,i;
		
		System.out.println("Enter Size of Array:");
		int size = scan.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter " +size+ " Array Elements:");
		
		for(i =0; i<arr.length; i++){
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter Element you want to Search:");
		int key = scan.nextInt();

		for( i=0; i<size; i++){
			if(arr[i] == key){
				flag = 1;
				break;	
			}
		}

		if(flag == 1)
			System.out.println("Element is Found! At location " +(i+1));
		else
			System.out.println("Element Not found!");
	}
}