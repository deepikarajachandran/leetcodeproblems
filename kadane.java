package com.company;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: nums = [1]
Output: 1

Input: nums = [5,4,-1,7,8]
Output: 23
 */
public class kadane {
    public static void main(String[] args) {
        int[] a={4,-1,2,1};
        int max=Integer.MIN_VALUE;
        int sum=0;

        for (int i=0;i<a.length;i++)
        {
            sum=0;
            for(int j=i;j<a.length;j++)
            {
                sum=sum+a[j];
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);

    }
}
