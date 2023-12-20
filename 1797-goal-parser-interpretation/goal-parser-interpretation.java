class Solution {
    public String interpret(String command) {
        String str = command.replace("()", "o");
        String str2 = str.replace("(","");
        String str3 = str2.replace(")","");
        return str3;
    }
}