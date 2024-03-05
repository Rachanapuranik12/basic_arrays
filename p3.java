//WAP to take an array of names as input from the user and print them on screen.

import java.io.*;
class ArrayNames{

	static void fun(String[] arr){

		System.out.println("Entered Names are:");

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int s = Integer.parseInt(br.readLine());

		String arr[] = new String[s];

		System.out.println("Enter names:");

		for(int i=0;i<s;i++){
			arr[i] = br.readLine();
		}

		fun(arr);
	}
}
