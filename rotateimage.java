package com.company;

import java.util.Arrays;

/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

logic- transpose and reverse each row - works for 4*4 too
 */
public class rotateimage {
    public static void rotate(int[][] mat)
    {
        for(int i=0;i< mat.length;i++)
        {
            for(int j=i;j< mat[0].length;j++)// (int j=0;j<i;j++) [or] (j=i;j< mat[0].length;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++) // reverse each row
        {
            int start=0,end=mat.length-1;
            while(start<end)
            {
                int t=mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=t;

                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat={{5,1,9,11},
                    {2,4,8,10},
                    {13,3,6,7},
                    {15,14,12,16}};
        System.out.println(Arrays.deepToString(mat));
        for(int k=0;k<4;k++)           // for 90deg-1, 180deg-2, 270deg - 3, 360-4
        {
            rotate(mat);
            System.out.println(Arrays.deepToString(mat));
        }

    }
}
