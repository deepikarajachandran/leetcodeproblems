package com.company;

import java.util.HashMap;

/*
majority element in an array A[] of size n is an element that appears more than n/2 times
(and hence there is at most one such element).

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater
than the half of the size of the array size.

Input : {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element


PROGRAM FOR BOTH N/2 AND N/3 MAJORITY
 */
public class majorityelement {
    public static void main(String[] args) {
        int[] a={3, 3, 4, 2, 4, 4, 2, 4,4};
        int count=0,n=a.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i],1);
            }
            else
            {
                count=hm.get(a[i])+1;
                hm.put(a[i],count);

                if(count>n/2)   // n/3 for n/3majority
                {
                    System.out.println("element "+a[i]+" count is "+count);
                    return;
                }

            }
        }
        System.out.println("no majority element");
    }
}
