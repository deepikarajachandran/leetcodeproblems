package com.company;

import java.util.HashMap;

/*
Given an unsorted array of size n. Array elements are in the range from 1 to n.
One number from set {1, 2, …n} is missing and one number occurs twice in the array.
Find these two numbers.

Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array,
2 is missing and 3 occurs twice

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1
 */
public class findrepeatandmiss {
    public static void main(String[] args) {
        int[] a={4, 3, 6, 2, 1, 1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int j : a) {
            if (!hm.containsKey(j)) {
                hm.put(j, 1);

            } else {
                System.out.println("repeating = " + j);
            }
        }
        for(int i=1;i< a.length;i++)
        {
            if(!hm.containsKey(i))
            {
                System.out.println("missing = "+ i );
            }
        }
    }
}
