//WAP to search an element in 2d array and return its index.

import java.io.*;
class ArraySearch{

	static void arraySearch(int[][] arr, int rows, int cols, int x){

		for(int i=0;i<rows;i++){

			for(int j=0;j<cols;j++){

				if(arr[i][j] == x){
					System.out.println("Element found at row "+i+" and column "+j);
				}
			}
		}
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

		System.out.println("Enter number to search:");
		int x = Integer.parseInt(br.readLine());

		arraySearch(arr,r,c,x);
	}
}
