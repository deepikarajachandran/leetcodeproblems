package com.company;

import java.util.Arrays;

/*

Input: vec1[] = { 1, 3, 4, 5}, vec2[] = {2, 4, 6, 8}
Output: vec3[] = {1, 2, 3, 4, 4, 5, 6, 8}

Input : vec1[]= {-7,12,17,29,41,56,79} , vec2[]= {-9,-3,0,5,19}
Output: {-9,-7,-3,0,5,12,17,19,29,41,56,79}

 */
public class merge2arrays {
    public static void main(String[] args) {
        int[] a={1,3,4,5};
        int[] b={2,4,6,8};
        int m= a.length,n= b.length,k=0;
        int[] c=new int[m+n];
        for (int value : a) {
            c[k++] = value;
        }
        for (int val : b) {
            c[k++] = val;
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
