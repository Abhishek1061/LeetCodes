class Solution {
    public int findDuplicate(int[] nums) {

        // My logic
        //  int i = 0;
        //   while(i < nums.length){
        //       int correct = nums[i] -1;
        //       if(nums[i] != nums[correct]){
        //           swap(nums, i, correct);
        //       }else{
        //           i++;
        //       }
        //   }
        //   //Find the duplicates
        // int ans = 0;
        // for (int index = 0; index < nums.length; index++) {
        //     if(nums[index] != index +1){
        //         ans = nums[index];
        //     }

        // }return ans;


        //2nd logic
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }else{
                    return nums[i];
                }
            }else {
                i++;
            }
        }return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}