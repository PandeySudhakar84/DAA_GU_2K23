package Lec8;

import java.util.Arrays;

class Unique_Path {
    static int dp[][]=new int[101][101];
    public int uniquePaths(int m, int n) {
       for(int arr[]:dp){
         Arrays.fill(arr,-1);
       }
        return unique(m,n,0,0);
    }
    public static int unique(int m,int n,int i,int j){
        if(i==m-1 || j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j]=unique(m,n,i,j+1)+unique(m,n,i+1,j);
        return dp[i][j];
    }
}