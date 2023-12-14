class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long i = 0;
        long j = num;
        
        while (i<j){
            long mid = i + (j-i)/2;
            long sq = mid * mid;
            if(num  == sq){
                return true;
            }else if(num < sq){
                j =mid;
            }else{
                i = mid +1;
            }
        }
        return false;
    }
}