//WAP to reverse each element in an array.
// input : 10 25 252 36 564
// output: 01 52 252 63 465

import java.io.*;
class ArrayReverseEle{

	static void printReverseEle(int[] arr){

		for(int i=0;i<arr.length;i++){

			int rev = 0;
			int n = arr[i];
			while(n!=0){
				int rem = n%10;
				rev = rev*10+rem;
				n=n/10;
			}
			System.out.println("Reverse of "+arr[i]+" is "+rev);
		}
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

		printReverseEle(arr);
	}
}


	
