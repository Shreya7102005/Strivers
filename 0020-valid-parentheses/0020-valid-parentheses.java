class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' ||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }
                else{
                    char element=st.pop();
                
                    if((ch==')' && element !='(')||(ch=='}' && element !='{')||(ch==']' && element !='[')){
                        return false;
                    }
                }
                
            }
        }
        return st.empty();
    }
}