class Solution {
    public boolean isPalindrome(int n) {
        int r,sum=0,temp;    
        temp=n;    
        while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
        }    
 
        if( sum == temp){
            return true;
        }else{
            return false;
        } 
    }
}