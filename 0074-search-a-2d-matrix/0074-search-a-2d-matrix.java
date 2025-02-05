class Solution {
    public boolean searchMatrix(int[][] m, int target) {
         for(int i=0;i<m.length;i++){
            for(int j=m[0].length-1;j>=0;j--){
                if(target==m[i][j]){
                    return true;
                }
               else if(target<m[i][j]){
                       continue;  
                }
                else{
                    break;
                }
            }
         }
         return false;
    }
}