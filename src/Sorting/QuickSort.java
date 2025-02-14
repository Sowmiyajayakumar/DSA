package Sorting;

import java.util.Arrays;
import java.util.List;

//QuickSort is a sorting algorithm based on the Divide and Conquer that picks an element as a pivot
// and partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.
//There are mainly three steps in the algorithm:
//
//Choose a Pivot: Select an element from the array as the pivot. The choice of pivot can vary (e.g., first element, last element, random element, or median).
//Partition the Array: Rearrange the array around the pivot. After partitioning, all elements smaller than the pivot will be on its left, and all elements greater than the pivot will be on its right. The pivot is then in its correct position, and we obtain the index of the pivot.
//Recursively Call: Recursively apply the same process to the two partitioned sub-arrays (left and right of the pivot).
//Base Case: The recursion stops when there is only one element left in the sub-array, as a single element is already sorted.

//The key process in quickSort is a partition(). There are three common algorithms to partition. All these algorithms have O(n) time complexity.
//
//Naive Partition: Here we create copy of the array. First put all smaller elements and then all greater. Finally we copy the temporary array back to original array. This requires O(n) extra space.
//Lomuto Partition:  this partition is used here. This is a simple algorithm, we keep track of index of smaller elements and keep swapping. We have used it here because of its simplicity.
//Hoare’s Partition: This is the fastest of all. Here we traverse array from both sides and keep swapping greater element on left with smaller on right while the array is not partitioned.
public class QuickSort {
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        for(int j= low;j<high;j++){
            if(arr[j]<pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,high);
        return i;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
//Time Complexity:
//
//Best Case: (Ω(n log n)), Occurs when the pivot element divides the array into two equal halves.
//Average Case (θ(n log n)), On average, the pivot divides the array into two parts, but not necessarily equal.
//Worst Case: (O(n²)), Occurs when the smallest or largest element is always chosen as the pivot (e.g., sorted arrays).
//Auxiliary Space: O(n), due to recursive call stack