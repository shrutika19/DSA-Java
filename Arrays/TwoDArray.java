import java.util.Scanner;

public class TwoDArray{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Row Size :");
		int row = scan.nextInt();

		System.out.println("Enter Column Size :");
		int column = scan.nextInt();

		int arr[] [] = new int[row][column];

		System.out.println("Enter Array Elements:");
		for(int i = 0; i<row; i++){
			for(int j=0; j<column ; j++){
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println("Array Elements are:");
		for(int i = 0; i<row; i++){
				System.out.println();
			for(int j=0; j<column ; j++){
				System.out.print("\t"+arr[i][j] +"\t");
			}
		}
	}
}