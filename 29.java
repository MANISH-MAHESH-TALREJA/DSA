class Solution
{
    public int divide(int dividend, int divisor)
    {
        int quotient = 0;
        boolean negative = false;
        int carry = 0;
        int orgDiv = divisor;
        int orgDividend = dividend;

        if(dividend < 0 && divisor < 0)
        {
            System.out.println("1");
            divisor = (-divisor);
            dividend = (-dividend);
            System.out.println(dividend);
            System.out.println(divisor);
            if(dividend < 0)
            {
                dividend = Integer.MAX_VALUE;
            }
            if(divisor < 0)
            {
                divisor = Integer.MAX_VALUE;
            }
        }
        else if(divisor < 0)
        {
            System.out.println("2");
            negative = true;
            divisor = (-divisor);
            if(divisor < 0)
            {
                divisor = Integer.MAX_VALUE;
            }
        }
        else if(dividend < 0)
        {
            System.out.println("3");
            negative = true;
            dividend = (-dividend);
            if(dividend < 0)
            {
                dividend = Integer.MAX_VALUE;
            }
        }
        System.out.println(dividend);
        System.out.println(divisor);
        while(dividend >= divisor)
        {
            dividend -= divisor;
            quotient++;
        }
        if(negative)
        {
            quotient = (-quotient);
            if(orgDividend == Integer.MIN_VALUE)
            {
                quotient += -1;
                System.out.println("CARRY");
            }
            if(orgDiv == Integer.MIN_VALUE)
            {
                quotient += 1;
                System.out.println("CARRY");
            }
        }
        return quotient;
    }
}

