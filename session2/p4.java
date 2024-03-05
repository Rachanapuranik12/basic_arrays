// WAP to print palindrome number from an array and return its index.


import java.io.*;
class ArrayPalindromeNum{

	static void palindromeNum(int[] arr){

		for(int i=0;i<arr.length;i++){

			int n = arr[i];
			int temp=n;
			int rev=0;

			while(n!=0){
				int rem = n%10;
				rev = rev*10+rem;
				n=n/10;
			}

			if(rev==temp){
				System.out.println("Palindrome number "+arr[i]+" found at index: "+i);
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

		palindromeNum(arr);
	}
}


