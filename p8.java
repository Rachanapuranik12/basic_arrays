//WAP to find composite number from an array and return its index.

import java.io.*;
class CompositeNumber{

	static void fun(int[] arr){
		
		
		for(int i=0;i<arr.length;i++){
			int n=arr[i];
			int cnt=0;

			for(int j=1;j<=n;j++){
				if(n%j==0)
					cnt++;
			}
			if(cnt>2)
				System.out.println("Composite number "+n+" found at index "+i);
		}
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
