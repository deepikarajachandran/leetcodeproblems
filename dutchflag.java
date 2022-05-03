package com.company;

import java.util.Arrays;

/*
Given an array nums with n objects colored red, white, or blue,
sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
solve this problem without using the library's sort function.

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]
 */
public class dutchflag {
    public static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        int start=0,mid=0,end=arr.length-1;
        while(mid<=end)
        {
            if(arr[mid]==0)
            {
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,end);
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
