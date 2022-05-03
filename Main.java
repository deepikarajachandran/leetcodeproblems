package com.company;

import java.util.Arrays;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class Main {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int k=3;
        int last= a.length-1,first=0;
        for(int i=0;i<k;i++)
        {
            int m=last;
            int temp=a[m];
            for(int j=m-1;j>=0;j--)
            {
                a[m]=a[j];
                m--;
            }

            a[first]=temp;
        }
        System.out.println(Arrays.toString(a));

    }
}
