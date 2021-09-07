import java.util.Scanner;

public class MergeSort{

	static void show(int a[], int n){
		System.out.println("Sorted Array Elements are:");
		for(int i =0; i < n; i++){
			System.out.println(a[i]);
		}
	}

	static void mergesort(int ar[], int low, int high, int mid){

		int i , j, k;
		i = k = low;
		j = mid+1;
		int newArr[] = new int[100];

		while(i <= mid && j <= high){
		
			if(ar[i] < ar[j]){
				newArr[k] = ar[i];
				i++;
				k++;
			}else{
				newArr[k] = ar[j];
				j++;
				k++;
			}	
		}

		while(i <= mid){
			newArr[k] = ar[i];
				k++;
				i++;
		}

		while(j <= high){
			newArr[k] = ar[j];
				k++;
				j++;
		}

		for(i = low; i<=high; i++){

        			ar[i] = newArr[i];
  		  }
	}

	
	static void merge(int b[], int l, int h){

		if(l < h){
			int mid = (l + h)/2;
			merge(b, l, mid);
			merge(b, mid+1, h);
			mergesort(b, l, h, mid);
		}
	}

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int arr[] = new int[100];

		System.out.println("Enter size of Array:");
		int size = scan.nextInt();

		System.out.println("Enter " +size+ " of Array Elements:");
		for(int i =0; i<size; i++){
			arr[i] = scan.nextInt();
		}

		int low =0;
		int high = size-1;

		merge(arr, low, high);
		show(arr, size);
		
	}
}