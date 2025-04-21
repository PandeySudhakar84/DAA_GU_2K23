package Lec14;

public class Find_Peak_Element {
    class Solution {
        public int findPeakElement(int[] arr) {
            int low=0;
            int high=arr.length-1;
            while(low<high){
                int mid=(low+high)/2;
                if(arr[mid]>arr[mid+1]){
                    high=mid;
                }
                else{
                    low=mid+1;
                }
            }
            return low;
        }
    }
}
