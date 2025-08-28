class Solution {
    public int removeDuplicates(int[] nums) {
        int in=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                 nums[in]=nums[i-1];
                 in++;
            }
        }
        nums[in]=nums[nums.length-1];
        return in+1;
    }
}