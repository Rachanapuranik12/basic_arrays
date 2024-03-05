//WAP to print digits of a number 
//input: 123
//output: 1 
//	  2
//	  3


import java.io.*;
class ArrayPrintDigits{

	static void printDigits(int n){

		int temp = n;
		int cnt=0;

		while(temp!=0){
			cnt++;
			temp=temp/10;
		}

		int arr[] = new int[cnt];
		temp = n;

		for(int i=0;i<arr.length;i++){

			int rem = temp%10;
			arr[i] = rem;
			temp=temp/10;

		}

		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number:");
		int s = Integer.parseInt(br.readLine());

		printDigits(s);
	}
}


			

			
