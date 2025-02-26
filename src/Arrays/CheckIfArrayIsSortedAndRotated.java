package Arrays;

//Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
//There may be duplicates in the original array.
//Input: nums = [3,4,5,1,2]
//Output: true
//Explanation: [1,2,3,4,5] is the original sorted array.
//You can rotate the array by x = 3 positions to begin on the element of value 3: [3,4,5,1,2].

//Input: nums = [2,1,3,4]
//Output: false
//Explanation: There is no sorted array once rotated that can make nums.

//Input: nums = [1,2,3]
//Output: true
//Explanation: [1,2,3] is the original sorted array.
//You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
public class CheckIfArrayIsSortedAndRotated {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i<n ;i++){
            if(i+1 < n && nums[i] > nums[i+1]){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        if(count == 0 || (count == 1 && nums[0] >= nums[n - 1])){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(check(arr));//true

        int[] arr2 = {3,4,5,1,2} ;
        System.out.println(check(arr2));//true

        int[] arr3 = {2,1,3,4} ;
        System.out.println(check(arr3));//false
    }
}
