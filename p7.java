// Take char array as input from user and print only vowels from the array.

import java.io.*;
class CharArray{
	static void fun(char[] arr){

		System.out.println("Vowels in array: ");

		for(int i=0;i<arr.length;i++){

			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' ||arr[i]== 'u')
				System.out.println(arr[i]);
		}
	}

		public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter size of array:");

			int s = Integer.parseInt(br.readLine());
			char arr[] = new char[s];

			System.out.println("Enter characters:");
			for(int i=0;i<s;i++){
				arr[i] = (char)br.read();
				br.skip(1);
			}

			fun(arr);
		}
	}

