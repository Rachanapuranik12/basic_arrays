// WAP to find an armstrong number from an array and return its index.

import java.io.*;
class ArmstrongNum{
		
		static void printArmStrong(int[] arr){

		for(int i=0;i<arr.length;i++){

			int n = arr[i];

			int t = n;
			int t1 = n;

			int cnt=0;

			while(n!=0){
				cnt++;
				n=n/10;
			}

			int sum=0;

			while(t!=0){
				int rem = t%10;
				int mult=1;
				for(int j=1;j<=cnt;j++){
					mult=mult*rem;
				}
				sum=sum+mult;
				t=t/10;
			}

			if(arr[i]==sum){
				System.out.println("Armstrong number "+t1+" found at index "+i);
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

		printArmStrong(arr);
	}
}




