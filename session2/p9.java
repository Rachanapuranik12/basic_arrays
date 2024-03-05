//Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.io.*;
class ArrayCheck{

	static void arrayCheck(int[] arr){
		
		boolean flag=true;

		for(int i=0;i<arr.length-1;i++){

			if(arr[i]>arr[i+1])
				flag = false;

		
		}

		if(flag){
			System.out.println("Array is in Ascending order");
		}else{
			System.out.println("Array is not in ascending order:");
		}
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

		arrayCheck(arr);
	}
}
