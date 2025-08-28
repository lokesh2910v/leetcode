class Solution {
    public void rotate(int[] nums, int k) {
        int nums1[]=new int[nums.length];

        while(k>nums.length){
            k=k%nums.length;
        }
    
        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[(nums.length+i-k) % nums.length];
         
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=nums1[i];
        }
    }
}