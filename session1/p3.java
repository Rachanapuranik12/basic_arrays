// Write a Java program to find the sum of even and odd numbers in an array.
//Display the sum value.


import java.io.*;
class ArrayOddEvenSum{
	static void fun(int[] arr){

		int oddsum=0;
		int evensum=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]%2==0)
				evensum = evensum+arr[i];
			else
				oddsum = oddsum+arr[i];
		}
		System.out.println("Sum of even elements: "+evensum);
		System.out.println("Sum of odd elements: "+oddsum);
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

