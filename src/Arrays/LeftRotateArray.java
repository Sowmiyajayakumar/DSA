package Arrays;

//Input: N = 6, array[] = {3,7,8,9,10,11} , k=3
//Output: 9 10 11 3 7 8
public class LeftRotateArray {

    public static void Rotatetoleft(int[] nums, int k) {
        k%=nums.length;
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse last n-k elements
        reverse(nums, k , nums.length - 1);
        // Reverse whole array
        reverse(nums, 0, nums.length - 1);
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
        Rotatetoleft(arr, k);
        System.out.print("After Rotating the k elements to right ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
//Time Complexity - O(N) where N is the number of elements in an array
//Space Complexity - O(1) since no extra space is required