class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid]> arr[mid+1]){
                //you are in the dec part of array
                // this may be the answer but look at left
                //this is why end != mid -1
                end = mid;
            }else {
                //you are in asc part of array
                start =mid +1; // because we know that mid +1 element > mid element
            }
        }
        //in the end, start == end and pointer to the largest number because of 2 checks above.
        // start and end are always  trying to find max element, in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what check say
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time
        //and if we are saying that one item is remaining, hence cuz of above line that is the bes possible ans
        return start;
    }
}