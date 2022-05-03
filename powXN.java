package com.company;
/*
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

Input: x = 2.00000, n = 10
Output: 1024.00000

Input: x = 2.10000, n = 3
Output: 9.26100


Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25
 */
public class powXN {
    public static void main(String[] args) {
        double x=34.00515;
        int n=-3;
        double mul=1;
        if(n>0)
        {
            for(int i=0;i<n;i++)
            {
                mul=mul*x;
            }
            System.out.println(mul);
        }
        else if(n<0)
        {
            n=Math.abs(n);
            double m=1;
            for(int i=0;i<n;i++)
            {
                m=m*x;
            }
            mul=mul/m;
            System.out.println(mul);
        }

    }
}
