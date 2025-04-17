package Lec1;

public class Second_Largest {
    class Solution {
        public int getSecondLargest(int[] arr) {
            // Code Here
            int f=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>f){
                    f=arr[i];
                }
            }
            int s=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>s && arr[i]<f){
                    s=arr[i];
                }
            }
            return s;
        }
    }
}
