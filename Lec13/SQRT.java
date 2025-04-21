package Lec13;

public class SQRT {
    class Solution {
        public int mySqrt(int x) {
            int low=1;
            int high=x;
            int ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if((long)mid*mid<=x){
                    ans=mid;
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
            // System.out.println(ans);
            return ans;
        }
    }
}
