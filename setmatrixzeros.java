package com.company;

import java.util.Arrays;

/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

Input: matrix = [[1,1,1],
                [1,0,1],
                [1,1,1]]
Output: [[1,0,1],
        [0,0,0],
        [1,0,1]]
 */
public class setmatrixzeros {
    public static void main(String[] args) {
        int[][] mat={{1,1,1},{1,0,1},{1,1,1}};
        int[][] temp=new int[mat.length][mat[0].length];
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                temp[i][j]=mat[i][j];
            }
        }
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    for(int p=0;p< temp.length;p++)
                    {
                        temp[p][j]=0;
                    }
                    for(int m=0;m< temp[0].length;m++)
                    {
                        temp[i][m]=0;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(temp));
    }
}
