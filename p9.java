//WAP to return index of prime number in an array.

import java.io.*;
class PrimeNumber{
	static void fun(int[] arr){

		for(int i=0;i<arr.length;i++){
			int cnt=0;
			int n=arr[i];

			for(int j=1;j<=n;j++){
				if(n%j==0)
					cnt++;
			}
			if(cnt==2)
				System.out.println("Prime number "+n+ " is found at index "+i);
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array:");
		int s = Integer.parseInt(br.readLine());

		int arr[] = new int[s];
		System.out.println("Enter elements of array:");
		for(int i=0;i<s;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		fun(arr);
	}
}
