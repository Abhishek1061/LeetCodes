class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n =  nums.length;

        for( int i = 0;  i < n- 1; i++){
            for( int j = 0;  j < n - i -1 ; j++){

                if(nums[j] % 2 != 0 && nums[j + 1] % 2 == 0){
                    int temp =  nums[j];
                    nums[j] =  nums[j + 1];
                    nums[j + 1] =  temp;
                }
            }
        }
        return nums;
    }
}
