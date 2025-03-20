package Arrays;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

//Step 1: Reverse the last k elements of the array
//
//Step 2: Reverse the first n-k elements of the array.
//
//Step 3: Reverse the whole array.
public class RightRotateArray {

    public static void Rotatetoright(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end){
        int temp = 0;
        while(start<end){
            temp= nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;
        Rotatetoright(arr, k);
        System.out.print("After Rotating the k elements to right ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
//Time Complexity - O(N) where N is the number of elements in an array
//Space Complexity - O(1) since no extra space is required
