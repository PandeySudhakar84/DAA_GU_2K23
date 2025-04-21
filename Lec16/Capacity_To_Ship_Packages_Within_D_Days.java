package Lec16;

public class Capacity_To_Ship_Packages_Within_D_Days {
    class Solution {
        public int shipWithinDays(int[] weights, int days) {
            int low=weights[0];
            int high=0;
            for(int num:weights){
                low=Math.max(low,num);
                high=high+num;
            }
            int ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(IsItPossible(weights,mid,days)){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }
        public boolean IsItPossible(int arr[],int mid,int days){
            int sum=0;
            int d=1;
            for(int i=0;i<arr.length;){
                if(arr[i]+sum<=mid){
                    sum=sum+arr[i];
                    i++;
                }
                else{
                    d++;
                    sum=arr[i];
                    i++;
                }
                if(d>days){
                    return false;
                }
            }
            return true;
        }
    }
}
