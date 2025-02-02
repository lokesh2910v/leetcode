class Solution {
    public int[] twoSum(int[] n, int t) {
        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<n.length;i++){
            int b=t-n[i];
            if(m.containsKey(b)){
                int val=m.get(b);
                return new int[]{val,i};
            }
              m.put(n[i],i);
          
        }
        return new int[]{}; 
    }
}