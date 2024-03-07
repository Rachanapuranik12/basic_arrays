//code to count and print the number of 7’s that are in the 2d array. It should print 2 for array-
//{ {4,7,8},{8,8,7} }


class Test1
{

    public static void main(String[] args)
    {
        int[][] array = { {4,7,8},{8,8,7} };
        int cnt=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == 7)
                    cnt++;
            }
        }
        System.out.println(cnt);

    

    }
}

