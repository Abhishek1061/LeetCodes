class Solution {
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        //Linear Search
        for (int i : nums) {
            start = Math.max(start, i); // in the end of the loop this will contain the max item   from the array.
            end += i;
        }

        //binary search
        while( start < end){
            //try for the middle as potential ans
            int mid = start + (end-start)/ 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums ) {
                if(sum +num > mid){
                    //you cannot add this in this subarray, make new one
                    //say you add this num in ew subarray, then sum = num
                    sum = num;
                    pieces ++;
                }else {
                    sum += num;
                }

            }
            if( pieces > m){
                start = mid + 1;
            }else {
                end = mid;
            }

        }
        return end; // here start == end
    }
}