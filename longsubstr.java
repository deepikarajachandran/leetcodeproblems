package com.company;

import java.util.HashSet;

/*

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class longsubstr {
    public static void main(String[] args) {
        String str="abcabcbb";
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++)
        {
            HashSet< Character > se = new HashSet < > ();
            for (int j = i; j < str.length(); j++)

            {
                if (se.contains(str.charAt(j)))

                {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(str.charAt(j));
            }
        }
        System.out.println(maxans);
    }
}
