//WAP to print second max element in an array.

import java.io.*;
import java.util.*;

class ArraySecondMax{

	static void printSecondMax(int[] arr){

		
			Arrays.sort(arr);
			int n = arr.length;

			if(n<2){
				System.out.println("There is no second largest element in the array:");
			}else{
				System.out.println("Second largest element is :"+arr[n-2]);}
			
			
			
	}


	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int s = Integer.parseInt(br.readLine());
		int arr[] = new int[s];

		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		printSecondMax(arr);
	}
}
