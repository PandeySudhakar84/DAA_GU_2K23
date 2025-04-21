package Lec13;

public class Number_of_occurrence {


    class Solution {
        int countFreq(int[] arr, int target) {
            // code here
            int f=first(arr,target);
            int l=last(arr,target);
            if(f==-1){
                return 0;
            }
            return l-f+1;
        }
        public int first(int nums[],int target){
            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target){
                    ans=mid;
                    high=mid-1;
                }
                else if(nums[mid]>target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }
        public int last(int nums[],int target){
            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target){
                    ans=mid;
                    low=mid+1;
                }
                else if(nums[mid]>target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }
    }
}
