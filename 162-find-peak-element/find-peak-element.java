class Solution {
    public int findPeakElement(int[] arr) {
        int start =0;
        int end  = arr.length-1, mid;

        while(start <= end){
        
            mid  = start + (end - start) / 2;

            if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == arr.length -1 || arr[mid] > arr[mid +1])){
                return mid;
            }else if(mid > 0  && arr[mid -1] > arr[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }

        }
        return -1;
    }
}