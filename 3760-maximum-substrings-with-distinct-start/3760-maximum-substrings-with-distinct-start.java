class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> ch=new HashSet<>();
        for(char c:s.toCharArray()){
            ch.add(c);
        }
        return ch.size();
    }
}