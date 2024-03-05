//WAP to merge two given array.

import java.io.*;
class ArrayMerge{

        static void printMerge(int[] arr1, int[] arr2){

		int size = arr1.length + arr2.length;

		int arr3[] = new int[size];

		for(int i=0;i<arr1.length;i++){

				arr3[i] = arr1[i];
			}

		for(int i=0;i<arr2.length;i++){
				
			arr3[arr1.length+i] = arr2[i];
		}
		

		System.out.println("Merged array is:");

		for(int i=0;i<size;i++){
			System.out.println(arr3[i]);
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

                printMerge(arr1,arr2);
        }
}
