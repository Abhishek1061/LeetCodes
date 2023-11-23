class Solution {
    
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            // push x_1 .. x_n
            ans[2 * i] = nums[i];
            // push y_1 .. y_n
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
