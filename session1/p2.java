//WAP to find the number of even and odd integers in a given array of integers.

import java.io.*;
class ArrayOddEven{
	static void fun(int[] arr){

		int oddcnt=0;
		int evencnt=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]%2==0)
				evencnt++;
			else
				oddcnt++;
		}
		System.out.println("Number of even elements: "+evencnt);
		System.out.println("Number of odd elements: "+oddcnt);
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

		fun(arr);
	}
}

