//WAP to print sum of all elements in 2D Array.

import java.io.*;
class ArraySum{

	static int printSum(int[][] arr, int rows, int cols){

		int sum=0;
		for(int i=0;i<rows;i++){

			for(int j=0;j<cols;j++){

				sum = sum+arr[i][j];
			}
		}

		return sum;
	}

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter rows:");
		int r = Integer.parseInt(br.readLine());

		System.out.println("Enter cols:");
		int c = Integer.parseInt(br.readLine());

		int arr[][] = new int[r][c];

		System.out.println("Enter array elements:");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){

			arr[i][j] = Integer.parseInt(br.readLine());
		}
		}

		System.out.println("Sum is:" +printSum(arr,r,c));
	}
}
