class Solution {
    public int myAtoi(String s) {

        s=s.trim();
   if (s.isEmpty()) return 0;
        int i=0;
        int sign=1;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        long val=0;

        while(i<s.length()&& Character.isDigit(s.charAt(i))){
            
                int temp=s.charAt(i)-'0';
                val=(val*10)+temp;
        
          if (val * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (val * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                i++;
            }
        
               return (int)val*sign;

    }
}