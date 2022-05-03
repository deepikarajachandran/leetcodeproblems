package com.company;
/*
UNIQUE PATH FROM START TO END IN MATRIX

Input: m = 3, n = 7
Output: 28
Example 2:

Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down


we can use right-R and down-D direction
for 2*2, 1R,1D for all moves
for 3*3, 1R,2D for all moves
so this is COMBINATIONS.But this solution does not pass all testcases due to int can not hold long values;
so need to use RECURSION.


 */
public class uniquepath {
  /*  public static int uniqpath(int m,int n)
    {
        if(m==1 || n==1)
        {
            return 1;
        }
        return uniqpath(m-1,n)+uniqpath(m,n-1);
    }
    public static void main(String[] args) {
        int m=3,n=7;
        int path= uniqpath(m,n);
        System.out.println(path);
    }*/
  public static int factorial(int n){
      int fact=1;
      for(int i=1;i<=n;i++)
      {
          fact=fact*i;
      }
      return fact;
  }
    public static int uniqpath(int m,int n)// combination method
    {
        if(m==1 || n==1)
        {
            return 1;
        }
        return factorial(m-1+n-1)/(factorial(m-1)*factorial(n-1));
    }
  public static void main(String[] args) {
      int m=3,n=7;
      int path= uniqpath(m,n);
      System.out.println(path);

  }
}
