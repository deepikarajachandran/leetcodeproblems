package com.company;
/*
In-place merge two sorted arrays
Input: ar1[] = {1, 5, 9, 10, 15, 20};
       ar2[] = {2, 3, 8, 13};
Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}
 */
import java.util.Arrays;

public class mergenoexspace {
    public static void main(String[] args) {
        int[] a={7,12,17,29,41,56,79};
        int[] b={-9,-3,0,5,19};
        int m= a.length,n= b.length;
        for(int i=0;i<m;i++)
        {
            if(a[i]>b[0])
            {
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;
            }
            Arrays.sort(b);
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
