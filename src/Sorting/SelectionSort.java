package Sorting;

//The algorithm steps are as follows:
//First, we will select the range of the unsorted array using a loop (say i) that indicates the starting index of the range.
//The loop will run forward from 0 to n-1. The value i = 0 means the range is from 0 to n-1, and similarly, i = 1 means the range is from 1 to n-1, and so on.
//        (Initially, the range will be the whole array starting from the first index.)
//Now, in each iteration, we will select the minimum element from the range of the unsorted array using an inner loop.
//        After that, we will swap the minimum element with the first element of the selected range(in step 1).
//Finally, after each iteration, we will find that the array is sorted up to the first index of the range.
//Assume the given array is: {7, 5, 9, 2, 8}
//
//Outer loop iteration 1:
//The range will be the whole array starting from the 1st index as this is the first iteration. The minimum element of this range is 2
//Outer loop iteration 2:
//The range will be from the [2nd index to the last index] as the array is sorted up to the first index. The minimum element of this range is 5(found using the inner loop).
//Outer loop iteration 3:
//The range will be from the [3rd index to the last index]. The minimum element of this range is 7(found using the inner loop).
//Outer loop iteration 4:
//The range will be from the [4th index to the last index]. The minimum element of this range is 8(found using the inner loop).
//So, after 4 iterations(i.e. n-1 iterations where n = size of the array), the given array is sorted.
public class SelectionSort {
    public static void selection_sort(int[] arr, int size){
        for(int i=0;i<size;i++){
            int mini = i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);
    }
}
//Time complexity: O(N^2), (where N = size of the array), for the best, worst, and average cases.
//Space Complexity: O(1)