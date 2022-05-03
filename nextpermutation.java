package com.company;

import java.util.Arrays;

/*
-Scan the array in a reverse order to find out the first position p which violate the ascending order.
-Scan the array from the end again to find the first position c which is firstly larger than p.
-Exchange the p and c.
-Sort the array partially after p.
1,2,3 → 1,3,2

3,2,1 → 1,2,3

1,1,5 → 1,5,1

Input: nums = [1,2,3]
Output: [1,3,2]
For example, for arr = [1,2,3],
the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
 */
public class nextpermutation {
    public static void swap(int[] a,int p,int c) {
        int temp=a[p];
        a[p]=a[c];
        a[c]=temp;
    }
    public static void main(String[] args) {
        int[] arr={6,4,5,1,1};

        int n= arr.length;
        int p=-1,c=-1;
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]>arr[i-1])
            {
                p=i-1;
                break;
            }
        }
        if( p == -1){
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }else{
            for(int i = n - 1; i >= 0; i--){
                if(arr[i] > arr[p]){
                    c = i;
                    break;
                }
            }

            swap(arr, p, c);
            Arrays.sort(arr, p + 1, arr.length);
            System.out.println(Arrays.toString(arr));
        }


    }
}
