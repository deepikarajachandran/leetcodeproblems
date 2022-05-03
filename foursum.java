package com.company;

import java.util.Arrays;

/*
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

THIS PROGRAM IS FOR PRINT ALL QUADRUPLETS;
 */
public class foursum {
    public static void main(String[] args) {
        int[] a={10, 2, 3, 4, 5, 9, 7, 8};
        int target=23,n=a.length;

        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
                for(int k=j+1;k<n-1;k++)
                {
                    for(int l=k+1;l<n;l++)
                    {
                        if((a[i]+a[j]+a[k]+a[l])==target)
                        {
                            System.out.println(a[i]+","+a[j]+","+a[k]+","+a[l]);
                        }
                    }
                }
            }
        }

    }
}
