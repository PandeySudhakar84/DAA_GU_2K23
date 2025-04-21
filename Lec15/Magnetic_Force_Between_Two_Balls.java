package Lec15;

import java.util.Arrays;
// same as Aggressive cows
public class Magnetic_Force_Between_Two_Balls {
    class Solution {
        public int maxDistance(int[] position, int m) {
            Arrays.sort(position);
            int low=1;
            int high=position[position.length-1]-position[0];
            int ans=0;

            while(low<=high){
                int mid=(low+high)/2; // mid represent kar rha h minimum distance b/t two ball
                if(IsItPossible(position,mid,m)){
                    ans=mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return ans;
        }
        public boolean IsItPossible(int arr[],int mid,int m){
            int boll=1;
            int pos=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]-pos>=mid){
                    boll++;
                    pos=arr[i];
                }
                if(boll==m){
                    return true;
                }
            }
            return false;
        }
    }
}
