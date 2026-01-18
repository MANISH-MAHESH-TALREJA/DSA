import java.util.Hashtable;
import java.util.Map;


class Solution
{
    public int repeatedNTimes(int[] nums)
    {
        Hashtable<Integer, Integer> repeated = new Hashtable<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(repeated.containsKey(nums[i]))
            {
                Integer value = repeated.get(nums[i]);
                repeated.put(nums[i], value + 1);
            }
            else
            {
                repeated.put(nums[i], 1);
            }
        }
        int max = 0;
        int output = 0;
        for(Map.Entry<Integer, Integer> value: repeated.entrySet())
        {
            if(value.getValue() > max)
            {
                max = value.getValue();
                output = value.getKey();
            }
        }
        return output;
    }
}




