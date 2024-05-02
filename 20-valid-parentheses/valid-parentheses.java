class Solution {
    public boolean isValid(String s) {
        LinkedList<String> list = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                list.push(Character.toString(s.charAt(i)));
            }
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(list.isEmpty()){
                    return false;
                }
                if(Objects.equals(list.peek(),"(") && s.charAt(i)==')'){
                    list.pop();
                }
                else if(Objects.equals(list.peek(),"{") && s.charAt(i)=='}'){
                    list.pop();
                }
                else if(Objects.equals(list.peek(),"[") && s.charAt(i)==']'){
                    list.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
}