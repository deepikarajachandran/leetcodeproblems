package com.company;
/*
Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class twosum {
    public static void main(String[] args) {
      int[] a={3,2,4};
      int sum=6;

      for(int i=0;i< a.length;i++)
      {
          if((a[i]+a[i+1])==sum)
          {
              System.out.println(a[i]+","+a[i+1]);
              System.out.println(i+","+(i+1));
              break;
          }
      }

    }
}
