// WAP to print product of odd index only.

import java.io.*;
class ArrayOddIndex{
	static void fun(int[] arr){

		int prod=1;
		for(int i=0;i<arr.length;i++){
			if(i%2!=0)
				prod=prod*arr[i];
		}

		System.out.println("Product of odd index is:" +prod);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int s = Integer.parseInt(br.readLine());

		int arr[] = new int[s];
		System.out.println("Enter elements of array:");

		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		fun(arr);
	}
}
