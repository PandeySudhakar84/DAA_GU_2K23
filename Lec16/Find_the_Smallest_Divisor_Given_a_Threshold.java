package Lec16;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    class Solution {
        public int smallestDivisor(int[] arr, int h) {
            int low=1;
            int high=arr[0];
            int ans=0;
            for(int num:arr){
                high=Math.max(num,high);
            }
            while(low<=high){
                int mid=(low+high)/2;
                if(IsItPossible(arr,mid,h)){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }
        public boolean IsItPossible(int arr[],int mid,int totalHour){
            int h=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=mid){
                    h++;
                }
                else if(arr[i]%mid==0){
                    h=h+arr[i]/mid;
                }
                else{
                    h=h+arr[i]/mid+1;
                }
                if(h>totalHour){
                    return false;
                }
            }
            return true;
        }
    }
}
