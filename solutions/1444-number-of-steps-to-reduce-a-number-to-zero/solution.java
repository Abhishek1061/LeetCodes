class Solution {
    public int numberOfSteps(int num) {
        return numberOfStepsCount(num, 0);
    }

// recursion method
    public int numberOfStepsCount(int num, int count){
        if(num == 0){
            return count;
        } 
        else if(num % 2 == 0 ){
            return numberOfStepsCount(num/2, count +  1); // checking for even condition and at the same time increasing the count.
        }else{
            return numberOfStepsCount(num -1 ,count + 1); //if odd substracting the 1 from the num value.
        }
    }
}





