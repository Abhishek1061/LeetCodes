class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int t[]= new int [nums.length];
        ArrayList<Integer> rb= new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
           rb.add(index[i], nums[i]);
        }
        for(int i=0; i<nums.length; i++)
        {
           t[i]=rb.get(i);
        }

        return t;
    }
}
