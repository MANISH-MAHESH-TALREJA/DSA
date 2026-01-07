class Solution
{
    public int findContentChildren(int[] g, int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int satisfied = 0;
        int assignedIndex = 0;
        for(int i = 0; i < g.length; i++)
        {
            if(assignedIndex < s.length)
            {
                if(g[i] <= s[assignedIndex])
                {
                    satisfied++;
                    assignedIndex++;
                }
                else
                {
                    i--;
                    assignedIndex++;
                }
            }
        }
        return satisfied;
    }
}