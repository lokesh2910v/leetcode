class Solution {
    public void moveZeroes(int[] nums) {
        int index=-1;
    for(int i=0;i<nums.length;i++){

        if(nums[i]==0){
            if(index!=-1){

            
            if(nums[index]!=0){
                index=i;
            }}else{
                index=i;
            }

        }
        else{
            if(index!=-1){

            
            nums[index]=nums[i];
            if(i!=index+1){
                index++;
            }else{
                index=i;
            }
            nums[i]=0;
        }

    

    }
    }
    }
}

