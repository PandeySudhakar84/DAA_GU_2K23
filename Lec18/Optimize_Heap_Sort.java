package Lec18;

public class Optimize_Heap_Sort {
    class Solution {
        public void heapSort(int arr[]) {
            int n = arr.length;
            for (int i = n / 2 - 1; i >= 0; i--) {
                downHeapify(arr, n, i);
            }
            for (int i = n - 1; i > 0; i--) {
                swap(arr, 0, i);
                downHeapify(arr, i, 0);
            }
        }

        void downHeapify(int arr[], int n, int i) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < n && arr[left] > arr[largest]) largest = left;
            if (right < n && arr[right] > arr[largest]) largest = right;
            if (largest != i) {
                swap(arr, i, largest);
                downHeapify(arr, n, largest);
            }
        }

        void swap(int[] arr, int i, int j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
//  Time and space Complexity:
//        Build Heap O(n)
//        Heap Sort | O(n log n)
//        Overall | O(n log n)
// and space O(1)