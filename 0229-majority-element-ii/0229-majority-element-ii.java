class Solution {
    public List<Integer> majorityElement(int[] nums) {
     if(nums.length<3){
        ArrayList<Integer> l=new ArrayList<>();
            HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
         for(int i:set){
            l.add(i);
        }
        return l;
     }

        Arrays.sort(nums);
        ArrayList<Integer> l=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                count++;
                if(count>(nums.length/3)){
                    set.add(nums[i-1]);
                }
            }
            else{
                    count=1;
            }
        }
   for(int i:set){
            l.add(i);
        }
        return l;
    }
}