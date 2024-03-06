//WAP to find second largest element in an array without using sorts function.

import java.io.*;
class SecondLargset{

	static void fun(int[] arr){

		for(int i=0;i<arr.length;i++){

			for(int j=i+1; j<arr.length;j++){

				if(arr[i]>arr[j]){

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second largest :"+arr[arr.length-2]);
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

		fun(arr);
	}
}

