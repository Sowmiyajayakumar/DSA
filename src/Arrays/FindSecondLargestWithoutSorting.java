package Arrays;

//Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
//
//Note: The second largest element should not be equal to the largest element.
public class FindSecondLargestWithoutSorting {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int max=-1;
        int secondMax = -1;
        for(int x : arr){
            if(x>max){
                secondMax = max;
                max = x;
            }else if(x < max && x > secondMax){
                secondMax = x;
            }
        }
        return secondMax;
    }
    public static void main(String[] args){
        int[] arr = {34, 12, 35, 1, 10, 33, 1};
        int secondLargest = getSecondLargest(arr);
        System.out.println("Second Largest Number = "+secondLargest);
    }
}
//Time Complexity: O(N)
//Space Complexity: O(1)
