//code to find the sum of the values on the diagonal


class Test2
{

    public static void main(String[] args)
    {
        int[][] array = { {1,2,3},{-1,-2,-3},{4,5,6} };
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(i==j){
                    sum=sum+array[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}

/*
 * OR
 * for(int i=0;i<array.length;i++){
 *   sum = sum+sum[i][i];
 *   }
