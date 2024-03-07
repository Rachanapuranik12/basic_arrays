// code to print out the sum of the numbers in the second row of the “table” array. It should print 18 for array -{ {1,4,9},{11,4,3},{2,2,3}}


class Test{
	public static void main(String[] args){

		int arr[][] = { {1,4,9},{11,4,3},{2,2,3}};

		int sum=0;

		for(int i=0;i<arr[0].length;i++){
			sum = sum+arr[1][i];   //arr[rows][cols]
		}

		System.out.println(sum);
	}
}

