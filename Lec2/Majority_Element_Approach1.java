package Lec2;

import java.util.Arrays;

public class Majority_Element_Approach1 {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }
}
