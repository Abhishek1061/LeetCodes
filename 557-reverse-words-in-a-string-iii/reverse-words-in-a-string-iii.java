class Solution {
    public String reverseWords(String str){
        String [] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }
        return String.join(" ", words);
    }
    static String reverseString(String str){
         char[]  charArray = str.toCharArray();

        for (int i = 0 , j = charArray.length -1 ; i < j ;i++ ,j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }
}