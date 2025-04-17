package Lec2;

public class Boyer_Moore_voting {
    class Solution {
        public int majorityElement(int[] nums) {
            int count=1;
            int candidate=nums[0];
            for(int i=1;i<nums.length;i++){
                if(candidate==nums[i]){
                    count++;
                }
                else{
                    count--;
                }
                if(count==0){
                    candidate=nums[i];
                    count=1;
                }
            }
            return candidate;
        }
    }
}
