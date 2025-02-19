class Solution {
    public int romanToInt(String s) {
        
HashMap<Character,Integer> map=new HashMap();
map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);

int sum=0;
int sub=0;
int val=map.get(s.charAt(s.length()-1));
for(int i=s.length()-1;i>0;i--){
    int temp=map.get(s.charAt(i));
    int temp2=map.get(s.charAt(i-1));
    if(temp2>=temp){
        val=val+temp2;
    }
    else if(temp2<temp){
        val=val-temp2;
    }
}
return val;
    }
}