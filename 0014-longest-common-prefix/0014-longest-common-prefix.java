class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        int min=strs[0].length();

        for(int i=1;i<strs.length;i++){
            min=Math.min(min,strs[i].length());
            for(int j=0;j<min;j++){              
                    
                if(strs[i].charAt(j)!=strs[0].charAt(j)){
                  min=Math.min(min,j);
                }
            }
        }

        return strs[0].substring(0,min);
    }
}