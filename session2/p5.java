//WAP to find a strong number from an array and return its index.

import java.io.*;
class ArrayStrongNum{

	static void printStrongNum(int[] arr){

		for(int i=0;i<arr.length;i++){

			int n=arr[i];
			int temp=n;
			int sum=0;

			while(n!=0){
				int rem = n%10;
				int fact=1;
				while(rem>=1){
					fact=fact*rem;
					rem--;
				}
				sum=sum+fact;
				n=n/10;
			}

			if(sum==temp){
				System.out.println("Strong number "+temp+" found at index "+i);
			}
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

		printStrongNum(arr);
	}
}



