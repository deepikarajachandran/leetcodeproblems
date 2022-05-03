package com.company;

import java.util.Arrays;

/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 */
public class mergesortedarr {
    public static void main(String[] args) {
        int m = 3 , n = 3;
        int[] a = new int[m + n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        int[] b = {2 , 6 , 7};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for(int i=0;i<b.length;i++)
        {
            a[i+m]=b[i];
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


    }
}
