//WAP to print the elements in an array whose addition of digits is even.
//eg = 26 = 2+6 = 8(even)


import java.io.*;
class ArrayEvenEle{

	static void fun(int[] arr){

		System.out.println("Elements whose addition is even:");

		int sum=0;

		for(int i=0;i<arr.length;i++){

			int n = arr[i];
	
			while(n!=0){
				int rem = n%10;
				sum = sum+rem;
				n=n/10;
			}

			if(sum%2==0){
				System.out.println(arr[i]);
			}
			sum=0;
		}
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

		fun(arr);
	}
}




