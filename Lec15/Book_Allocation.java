package Lec15;
public class Book_Allocation {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int nos = 2;
        System.out.println(minpage(arr, nos));
    }
    public static int minpage(int[] arr, int nos) {
        int hi = 0;
        for (int i = 0; i < arr.length; i++) {
            hi += arr[i];
        }
        int lo = 0;
        int ans = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2; // here mid represent 1 student can read at most "mid" no of pages
            if (isitpossible(arr, mid, nos) == true) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isitpossible(int[] arr, int mid, int nos) {
        int s = 1;
        int reapapge = 0;
        int i = 0;
        while (i < arr.length) {
            if (reapapge + arr[i] <= mid) {
                reapapge += arr[i];
                i++;
            } else {
                reapapge = 0;
                s++;
            }
            if (s > nos) {
                return false;
            }
        }
        return true;
    }
}