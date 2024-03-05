//WAP to print uncommon elements between two arrays.


import java.io.*;
class ArrayUnCommonEle{

	static void printCommonele(int[] arr1, int[] arr2){

		System.out.println("uncommon elments between two arrays:");

		int flag=0;

		for(int i=0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++){

				if(arr1[i]==arr2[j]){

					flag=1;
				}
			}
				if(flag==0){
					System.out.println(arr1[i]);
				}
		

				flag=0;
		}

		for(int i=0;i<arr2.length;i++){

			for(int j=0;j<arr1.length;j++){

				if(arr2[i]==arr1[j]){
			
					flag=1;
				}
			}
				if(flag==0){
					System.out.println(arr2[i]);
				}
				flag=0;


			}
		
		}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array1:");
		int s = Integer.parseInt(br.readLine());

		int arr1[] = new int[s];
		System.out.println("Enter array1 elements:");
		for(int i=0;i<s;i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}


		System.out.println("Enter size of array2:");
		int s1 = Integer.parseInt(br.readLine());

		int arr2[] = new int[s1];
		System.out.println("Enter array2 elements:");
		for(int i=0;i<s1;i++){
			arr2[i] = Integer.parseInt(br.readLine());
		}

		printCommonele(arr1,arr2);
	}
}



