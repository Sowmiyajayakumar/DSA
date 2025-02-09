package Sorting;

import java.util.ArrayList;
import java.util.List;

//Merge Sort is a divide and conquers algorithm, it divides the given array into equal parts and then merges the 2 sorted parts.
//There are 2 main functions :
//merge(): This function is used to merge the 2 halves of the array. It assumes that both parts of the array are sorted and merges both of them.
//mergeSort(): This function divides the array into 2 parts. low to mid and mid+1 to high where,
// low = leftmost index of the array
// high = rightmost index of the array
// mid = Middle index of the array
//We recursively split the array, and go from top-down until all sub-arrays size becomes 1.
class Solution{
    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
public class MergeSort {
    public static void main(String args[]) {
        int n = 7;
        int arr[] = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
//Time complexity: O(nlogn)
//Reason: At each step, we divide the whole array, for that logn and we assume n steps are taken to get a sorted array, so overall time complexity will be nlogn
//Space complexity: O(n)
//Auxiliary Space Complexity: O(n)