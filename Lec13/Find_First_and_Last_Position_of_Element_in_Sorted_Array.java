package Lec13;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int f=first(nums,target);
            int s=last(nums,target);
            return new int[]{f,s};
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
