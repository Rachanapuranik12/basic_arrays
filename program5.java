//Print the number of rows in the given two-dimensional array, or the length of the outer array. Then print the number of columns, or the length of each inner array.

//Ex. The array { {“hello”,”there”,”world”},{“how”,”are”,”you”} } should print:

//Rows: 2

//Columns: 3


class ArrayExcercise{

	public static void main(String[] args){

		String arr[][] = {{"hello","there","world"},{"how","are","you"}};

		for(int i =0;i<arr.length;i++){ //arr.length = count of no.of rows

			for(int j=0;j<arr[0].length;j++){ // arr[0] = denotes 1 column and all cols will have same length

				System.out.println(arr[i][j]);
			}
		}
	}
}

