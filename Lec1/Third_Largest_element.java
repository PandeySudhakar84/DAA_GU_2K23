package Lec1;

public class Third_Largest_element {
    class Solution {
        int thirdLargest(int arr[]) {
            if (arr.length < 3) return -1;
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > first) {
                    third = second;
                    second = first;
                    first = num;
                } else if (num >= second && num <= first) {
                    third = second;
                    second = num;
                } else if (num >= third && num <= second) {
                    third = num;
                }
            }
            return third == Integer.MIN_VALUE ? -1 : third;
        }
    }

}
