package Lec17;
 // same as book allocation
public class Split_Array_Largest_Sum {
    class Solution {
        public int splitArray(int[] arr, int nos) {
            return Allocation(arr,nos);
        }
        public static int Allocation(int arr[],int nos){
            // find the search space
            int low=0;
            int high=0;
            int ans=0;
            for(int num:arr){
                high=high+num;
            }
            while(low<=high){
                int mid=(low+high)/2;
                if(IsItPossible(arr,mid,nos)){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }
        public static boolean IsItPossible(int arr[],int mid,int nos){
            int s=1;
            int sum=0;
            for(int i=0;i<arr.length;){
                if(sum+arr[i]<=mid){
                    sum=sum+arr[i];
                    i++;
                }
                else {
                    s++;
                    sum=0;
                }
                if(s>nos){
                    return false;
                }
            }
            return true;
        }
    }
}
