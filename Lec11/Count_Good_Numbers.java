package Lec11;

public class Count_Good_Numbers {
    class Solution {
        int mod=(int) 1e9+7;
        public int countGoodNumbers(long n) {
            long totalNoOfEven=(n%2==0?n/2:n/2+1);
            long totalNoOfOdd=n/2;
            long mul1=power(5,totalNoOfEven)%mod;
            long mul2=power(4,totalNoOfOdd)%mod;
            long ans=1;
            ans=(ans*mul1*mul2)%mod;
            // ans=(ans*mul1)%mod;
            // ans=(ans*mul2)%mod;
            return (int) ans;
        }
        public long power(long x,long n){
            if(n==0){
                return 1;
            }
            if(n%2==0){
                long y=power(x,n/2)%mod;
                return y*y;
            }
            else{
                long y=power(x,n/2)%mod;
                return x*y*y;
            }
        }
    }

}
