package com.company;
/*
Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
Output: 5
Explanation: The longest sub-array with
elements summing up-to 0 is {-2, 2, -8, 1, 7}

Input: arr[] = {1, 2, 3}
Output: 0
Explanation:There is no subarray with 0 sum

Input:  arr[] = {1, 0, 3}
Output:  1
Explanation: The longest sub-array with
elements summing up-to 0 is {0}
 */
public class longsubarray0 {
    public static void main(String[] args) {
        int[] a={15, -2, 2, -8, 1, 7, 10, 23};
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=i;j< a.length;j++)
            {
                sum=sum+a[j];
                if(sum==0)
                {
                    max=Math.max(max,j-i+1);
                }
            }
        }
        System.out.println(max);

    }
}
