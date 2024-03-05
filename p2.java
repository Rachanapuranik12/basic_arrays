// WAP to take an array from the user and serach for a given element x and print the index at whic it occurs.

import java.io.*;
class ArrayDemo1{
	static void fun(int[] arr, int x){

		for(int i=0;i<arr.length;i++){
			if(arr[i] == x){
				System.out.println(x+" found at index "+i);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int s = Integer.parseInt(br.readLine());

		int arr[]=new int[s];

		System.out.println("Enter elements of array first:");

		for(int i=0;i<s;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter number to search:");
		int x=Integer.parseInt(br.readLine());

		fun(arr,x);
	}
}
