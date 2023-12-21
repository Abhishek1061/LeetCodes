class Solution {
    public boolean halvesAreAlike(String s) {
        String S1 = "";
        String S2 = "";
        String  val = "aeiouAEIOU"; 

        for (int i = 0; i < s.length()/2; i++) {
            S1 += s.charAt(i);
        }
        for (int i = s.length()/2; i < s.length() ; i++) {
            S2 += s.charAt(i); 
        }
        int countS1 = countVowels(S1,val);
        int countS2 = countVowels(S2,val);
        return countS1 == countS2;
    }
    static int countVowels(String str, String vowels){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(String.valueOf((str.charAt(i))))) {
                count++;
            }
        }return count;
    }
}