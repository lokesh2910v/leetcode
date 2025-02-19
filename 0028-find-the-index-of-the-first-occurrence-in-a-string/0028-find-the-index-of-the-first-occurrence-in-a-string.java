class Solution {
    public int strStr(String h, String n) {
       int  len=n.length();

        for(int i=0;i<h.length()-len+1;i++){
            String temp=h.substring(i,i+len);
            if(temp.equals(n)){
                return i;
            }
        }
        return -1;
    }
}