class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
        
    }
    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e -s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m-1);
        }
        if(target > arr[m]){
            return search(arr, target, m +1, e);
        }
        return -1;
    }
}