class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i <candies.length ; i++) {
            if(candies[i]> max)
                max = candies[i];
        }for (int i : candies) {
            if( i + extraCandies >= max)
                li.add(true);
            else
                li.add(false);
        }
        return li;
    }
}
