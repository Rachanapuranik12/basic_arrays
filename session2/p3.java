// WAP to find a perfect number from an array and return its index.


import java.io.*;
class ArrayPerfectNumber{
	static void printPerfectNum(int[] arr){

		for(int i=0;i<arr.length;i++){
			int n=arr[i];
			int sum=0;
			for(int j=1;j<n;j++){
				if(n%j==0){
					sum=sum+j;
				}
			}
			if(sum==n){
				System.out.println("Perefect nummber "+arr[i]+" found at "+ i);
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

		printPerfectNum(arr);
	}
}

