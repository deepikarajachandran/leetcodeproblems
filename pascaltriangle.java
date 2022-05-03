package com.company;
/*
 Pascal's Triangle
           1
         1   1
       1   2   1
     1   3   3    1
   1  4    6   4   1
 1  5   10   10  5   1
 */
public class pascaltriangle {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<n;i++)
        {
            for (int space = 1; space <= n-i; space++)
            {
                System.out.print(" ");
            }
            int a=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
                System.out.print(a);
                a=a*(i-j)/j;

            }
            System.out.println();
        }
    }
}
