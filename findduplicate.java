package com.company;

import java.util.HashSet;

/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and
 each integer appears once or twice, return an array of all the integers that appears twice.


Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
 */
public class findduplicate {
    public static void main(String[] args) {
        int[] a={4,3,2,7,8,2,3,1};
        HashSet<Integer> hs=new HashSet<>();
        for (int j : a) {
            if (!hs.contains(j)) {
                hs.add(j);
            } else {
                System.out.println(j);
            }
        }

    }
}
