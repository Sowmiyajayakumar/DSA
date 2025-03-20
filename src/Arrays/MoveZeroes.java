package Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//The idea is that we go through the array and gather all zeros on our road.
//Let's take our example:
//the first step - we meet 0.
//Okay, just remember that now the size of our snowball is 1. Go further.
//Next step - we encounter 1. Swap the most left 0 of our snowball with element 1.
//Next step - we encounter 0 again!
//Our ball gets bigger, now its size = 2.
//Next step - 3. Swap again with the most left zero. Looks like our zeros roll all the time
//Next step - 12. Swap again
public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        int snowballSize = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                snowballSize++;
            }else if(snowballSize > 0){
                nums[i-snowballSize] = nums[i];
                nums[i] = 0;
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.print("After moving zeroes to right ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}
//Time Complexity - O(N) where N is the number of elements in an array
//Space Complexity - O(1) since no extra space is required
