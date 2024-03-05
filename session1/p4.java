//WAP to find max element from an array.

import java.io.*;
class ArrayMaxElement{

	static void printMax(int[] arr,int max){


		for(int i=0;i<arr.length;i++){
		      //max = arr[0];

			if(arr[i]>max){
				max=arr[i];
			}

		}
		
		System.out.println("max element is:" +max);
			

	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter size of array:");
		int s = Integer.parseInt(br.readLine());

		int arr[] = new int[s];

		System.out.println("enter elements:");
		for(int i=0;i<s;i++){
			arr[i] = Integer.parseInt(br.readLine());


		}

		int max = arr[0];

		printMax(arr,max);

		
	}
}
