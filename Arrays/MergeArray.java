//java prgram to merge two array to form new third array

import java.util.Scanner;

public class MergeArray{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int arr1[] = new int[100];
		int arr2[] = new int[100];
		int newArr[] = new int[100];
		int i, temp;

		System.out.println("Enter Size of First Array:");
		int size1 = scan.nextInt();

		System.out.println("Enter " +size1+ " First Array Elements:");
		for(i =0 ; i < size1; i++){
			arr1[i] = scan.nextInt();
			newArr[i] = arr1[i];
		}

		temp= i;

		System.out.println("Enter Size of Second Array:");
		int size2 = scan.nextInt();

		System.out.println("Enter " +size2+ " Second Array Elements:");
		for(i =0 ; i < size2; i++){
			arr2[i] = scan.nextInt();
			newArr[temp] = arr2[i];
			temp++;
		}

		System.out.println("New Array is:");
		for( i =0 ; i < temp; i++){
			System.out.println(newArr[i]);
		}


	}
}