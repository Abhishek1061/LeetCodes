class Solution {
    int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];//square each number.
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0 && nums[j] < nums[j-1] ; j--) {
                swap(nums, j, j-1);
            }
        }
        return nums;
    }
    static void swap(int[] arr, int  first,  int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}