package Sorting;

//Approach:
//
//Select an element in each iteration from the unsorted array(using a loop).
//Place it in its corresponding position in the sorted part and shift the remaining elements accordingly (using an inner loop and swapping).
//The “inner while loop” basically shifts the elements using swapping.
public class InsertionSort {
    static void insertion_sort(int[] arr, int n) {
        for(int i=1;i<n;i++){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("After Insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 13,54,5,2,36} ;
        int n = arr.length;
        System.out.println("Before Insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr, n);
    }
}
//Time complexity: O(N2), (where N = size of the array), for the worst, and average cases.
//Best Case Time Complexity:
//The best case occurs if the given array is already sorted. And if the given array is already sorted, the outer loop will only run and the inner loop will run for 0 times. So, our overall time complexity in the best case will boil down to O(N), where N = size of the array.
//Space Complexity: O(1)