class Solution
{
    public long maxMatrixSum(int[][] matrix)
    {
        int numberOfNegatives = 0;
        int smallest = Integer.MAX_VALUE;
        long sum = 0;
        System.out.println(matrix[0].length);
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] < 0)
                {
                    numberOfNegatives++;
                    sum += (-matrix[i][j]);
                    if((-matrix[i][j]) < smallest)
                    {
                        smallest = (-matrix[i][j]);
                    }
                }
                else
                {
                    sum += matrix[i][j];
                    if(matrix[i][j] < smallest)
                    {
                        smallest = matrix[i][j];
                    }
                }
            }
        }
        System.out.println(smallest);
        System.out.println(sum);
        if(numberOfNegatives % 2 == 0)
        {
            return sum;
        }
        else
        {
            return sum - smallest - smallest;
        }
    }
}


