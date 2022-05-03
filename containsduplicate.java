package com.company;

import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.
Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
 */
public class containsduplicate {
    public static boolean check(int[] b)
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]==b[j])
                {
                    return true;
                }
            }
        }
        return false;
        /*
         Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i)
        {
         if (nums[i] == nums[i + 1])
             return true;
         }
        return false;
         */
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};

        if(check(a))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
