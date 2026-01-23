class Solution
{
    public boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        int placed = 0;
        if(n == 0) // EDGE CASE 01
        {
            return true;
        }
        if(flowerbed.length == 1 && flowerbed[0] == 0) // EDGE CASE 02
        {
            return 1 == n;
        }
        if(flowerbed.length == 1 && flowerbed[0] == 1) // EDGE CASE 03
        {
            return 0 == n;
        }
        for(int i = 0; i < flowerbed.length - 1; i++)
        {
            if(i == 0 && flowerbed[i] == 0 && flowerbed[i+1] != 1)
            {
                // CASE FOR HANDLING INITIAL 0
                placed++;
                flowerbed[i] = 1;
            }
            else if(flowerbed[i] == 1)
            {
                // CASE FOR HANDLING 1 - IF 1 NO PLOT
                continue;
            }
            else if(i > 0 && flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] != 1)
            {
                // CASE FOR HANDLING THAT PREVIOUS, CURRENT AND NEXT ARE NOT 1, THEN PLACE THE 1 IN CURRENT
                placed++;
                flowerbed[i] = 1;
            }
            // CROSS CHECK, IF GOAL ACHIEVED TOO EARLY THEN RETURN NOW ONLY
            if(placed == n)
            {
                return true;
            }
        }
        // CHECK FOR THE LAST 0 AND THE SECOND LAST 0
        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0)
        {
            placed++;
            flowerbed[flowerbed.length - 1] = 1;
        }
        return placed == n;
    }
}

