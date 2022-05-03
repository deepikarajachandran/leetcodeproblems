package com.company;

import java.util.Arrays;
import java.util.HashSet;

/*
remove duplicates from sorted array and return original count
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2,
with the first two elements of nums being 1 and 2.

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

 */
public class removeduplicate {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int[] a=new int[nums.length];
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        for(int i:hs)
        {
            a[count++]=i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);

    }
}
