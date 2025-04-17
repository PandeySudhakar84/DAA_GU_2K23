package Lec1;
public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 6, 4, 9, 8, 11, 45, -9, 1 };
        int item = 11;
        System.out.println(Search(arr, item));

    }

    public static int Search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;

    }
}