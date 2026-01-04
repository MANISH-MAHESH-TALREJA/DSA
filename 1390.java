class Solution
{
    public int sumFourDivisors(int[] nums)
    {
        int divisorCount = 0;
        int totalSum = 0;
        int divisorSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            divisorCount = 0;
            divisorSum = 0;
            for(int j = 1; j <= nums[i]; j++)
            {
                if(nums[i] % j == 0)
                {
                    divisorCount++;
                    divisorSum += j;
                }
                if(divisorCount > 4)
                {
                    divisorCount = 0;
                    divisorSum = 0;
                    break;
                }
            }
            if(divisorCount == 4)
            {
                totalSum += divisorSum;
            }
        }
        return totalSum;
    }
}