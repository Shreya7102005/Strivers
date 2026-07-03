class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char ch[]=words[i].toCharArray();
            for(char c:ch){
                if(c==x){
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}