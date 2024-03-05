//WAP to find min element from an array.


import java.io.*;
class ArrayMinElement{

	static void printMin(int[] arr){

		int min = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){

			if(arr[i]<min)
				min = arr[i];
		}

		System.out.println("Min element is:" +min);
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int s =  Integer.parseInt(br.readLine());

		int arr[] = new int[s];

		System.out.println("Enter array elements:");

		for(int i=0;i<s;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		printMin(arr);
	}
}
