class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str = "";
        String str2 = "";

        for (int i = 0; i < word1.length; i++) {
            str += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];
        }
        return str.equals(str2);

    }
}