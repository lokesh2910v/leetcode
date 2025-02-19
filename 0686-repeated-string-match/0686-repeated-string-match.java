class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuffer s=new StringBuffer(a);
        
       
            if(a.contains(b)){
                return 1;
            }
    
        
            int i=1;
            while(s.length()<b.length()){
                 s=s.append(a);
                 i++;
            }

            if(s.toString().contains(b)){
                return i;
            }
            
            s=s.append(a);
            i++;
            if(s.toString().contains(b)){
                return i;
            }
            
        
        return -1;
    }
}