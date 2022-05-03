package com.company;

import java.util.Arrays;
import java.util.HashSet;

/*
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */
public class longconseq {
    public static void main(String[] args) {
        int[] a={0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(a);
        int max=Integer.MIN_VALUE;
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int j : a) {
            hs.add(j);
        }
        for(int i: hs)
        {
            count=0;
            int j=i-1;
            while(hs.contains(j))
               {
                   count++;
                   if(max<count)
                    {
                        max=count;
                    }
                    j++;
                }
        }
        System.out.println(max);
    }
}
