class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowel=new ArrayList<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U' ){
                vowel.add(ch[i]);
            }
        }
        StringBuilder newStr=new StringBuilder();
        int a=vowel.size()-1;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U' ){
                newStr.append(vowel.get(a));
                a--;
            }
            else{
                newStr.append(ch[i]);
            }
        }
        return newStr.toString();
    }
}