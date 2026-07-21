class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        long y = 0;
        String x =  Integer.toString(n);


        if(n != 0){
            for(int i = 0; i < x.length(); i++){
                int digit  =  x.charAt(i) - '0';

                if(digit != 0){
                    sum = sum + digit;
                    y =  y * 10 + digit;
                }
            }

            return sum*y;
        }
        return 0;    
    }
}
