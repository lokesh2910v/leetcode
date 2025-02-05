class Solution {
    public void nextPermutation(int[] nums) {
    
    int count=0;;
      for(int i=1;i<nums.length;i++){
        if(nums[i]<=nums[i-1]){
            count++;
        }
      }

      if(count==nums.length-1){
        int k=nums.length-1;
        for(int i=0;i<nums.length/2;i++){
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            k--;
        }
      }
      else{

        int index=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }


        int index2=index;
        for(int i=index+1;i<nums.length;i++){
            if (nums[i] > nums[index])
                {
                index2=i;
            }
        }


           int temp = nums[index];
nums[index] = nums[index2];
nums[index2] = temp;


        int start = index + 1, end = nums.length - 1;
            while (start < end) {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
      }
    }
}