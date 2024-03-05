//WAP to print only sum of odd elements in an array.

import java.io.*;
class ArrayElements{
	static void fun(int[] arr){

		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1)
				sum=sum+arr[i];
		}
		System.out.println("Sum of odd elements is: "+sum);
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array:");
		int s = Integer.parseInt(br.readLine());

		int arr[] = new int[s];
		System.out.println("Enter elements:");


		for(int i=0;i<s;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		fun(arr);
	}
}
