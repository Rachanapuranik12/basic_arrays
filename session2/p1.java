//Write a program to print count of digits in elements of array.
//Input: Enter array elements : 23 255 2 1554
//Output: 2 3 1 4


import java.io.*;
class ArrayCountDigits{

	static void printCount(int[] arr){

		for(int i=0;i<arr.length;i++){
			int cnt=0;
			int n = arr[i];

			while(n!=0){
				cnt++;
				n=n/10;
			}

			System.out.println("Count of digits in number: "+arr[i]+" is "+cnt);

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

		printCount(arr);
	}
}

