class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> a=new ArrayList<>();
        for(int i=0;i<t.length();i++){
            a.add(t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(a.contains(s.charAt(i))){
                a.remove(a.indexOf(s.charAt(i)));
            }
            else{
                return false;
            }
        }
        if(a.size()==0){
            return true;
        }
        return false;
    }
}