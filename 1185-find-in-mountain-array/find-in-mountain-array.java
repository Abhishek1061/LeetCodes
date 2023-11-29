class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = MountainArray(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in the second half
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    public int MountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                // you are in the decreasing part of the array
                // this may be the answer, but look at the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in the ascending part of the array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and points to the largest number because of 2 checks above.
        // start and end are always trying to find the max element, in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point in time for start and end, they have the best possible answer till that time
        // and if we are saying that one item is remaining, hence because of the above line, that is the best possible answer
        return start;
    }

    static int orderAgnosticBS(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
