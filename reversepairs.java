package com.company;
/*
Given an integer array nums, return the number of reverse pairs in the array.
A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] > 2 * nums[j].

Input: nums = [1,3,2,3,1]
Output: 2

Input: nums = [2,4,3,5,1]
Output: 3

all testcases passed by merge sort.not by this method.
 */
public class reversepairs {
    public static void main(String[] args) {
        int[] arr={1,3,2,3,1};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>2*arr[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
