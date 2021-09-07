import java.util.Scanner;

public class MatrixAddition{
	public static void main(String args[]){
	
		Scanner scan = new  Scanner(System.in);

		System.out.println("Enter Size of Row:");
		int row = scan.nextInt();
		
		System.out.println("Enter Size of Column:");
		int col= scan.nextInt();

		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		int sum[][] = new int[row][col];
		
		System.out.println("Enter First Array Elements:");

		for(int i = 0 ; i < row; i++){
			System.out.println();
			for(int j= 0 ; j<col; j++){
				System.out.print("\t");
				arr1[i][j] = scan.nextInt();
				System.out.print("\t");
				
			}
		}

		System.out.println();
		System.out.println("Enter Second Array Elements:");

		for(int i = 0 ; i < row; i++){
			System.out.println();
			for(int j= 0 ; j<col; j++){
				System.out.print("\t");
				arr2[i][j] = scan.nextInt();
				System.out.print("\t");
			}
		}

		
		System.out.println();
		System.out.println("Addition of Matrix is:");

		for(int i = 0 ; i < row; i++){
			System.out.println();
			for(int j= 0 ; j<col; j++){
				System.out.print("\t");
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(sum[i][j] +"\t");
			}
		}	
		
	}
}