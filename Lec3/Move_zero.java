package Lec3;

public class Move_zero {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static int[]  moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        return nums;
    }
}
