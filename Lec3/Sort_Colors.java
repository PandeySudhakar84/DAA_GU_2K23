package Lec3;

public class Sort_Colors {
    class Solution {
        public void sortColors(int[] nums) {
            int low=0;
            int high=nums.length-1;
            int mid=0;
            while(mid<=high){
                if(nums[mid]==0){
                    int temp=nums[mid];
                    nums[mid]=nums[low];
                    nums[low]=temp;
                    mid++;
                    low++;
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else{
                    int temp=nums[high];
                    nums[high]=nums[mid];
                    nums[mid]=temp;
                    high--;
                }
            }
        }
    }
}
