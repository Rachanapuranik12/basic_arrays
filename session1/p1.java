//WAP to find sum of all elements in an array. Take input from user.

import java.io.*;
class ArraySum{
	static int printSum(int[] arr){

		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum =sum+arr[i];
		}

		return sum;
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array:");
		int s = Integer.parseInt(br.readLine());

		int arr[] = new int[s];

		System.out.println("Enter array elements:");
		for(int i=0;i<s;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Sum of elements in array: "+printSum(arr));
	}
}
