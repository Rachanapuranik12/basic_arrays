// WAP to take rows and cols from user and print elements of 2D array.

import java.io.*;
class PrintArray{

	static void printArray(int[][] arr, int rows, int cols){

		for(int i=0;i<rows;i++){

			for(int j=0;j<cols;j++){

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter rows:");
		int r = Integer.parseInt(br.readLine());

		System.out.println("Enter cols: ");
		int c = Integer.parseInt(br.readLine());

		int arr[][] = new int[r][c];

		System.out.println("Enter array elements:");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
			arr[i][j] = Integer.parseInt(br.readLine());
		}
		}

		printArray(arr,r,c);
	}
}
