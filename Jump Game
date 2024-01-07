class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int currIdxToReach = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=currIdxToReach){
                currIdxToReach = i;
            }
        }
        return 0 == currIdxToReach;
    }
}

//Simple solution starting from backwards and checking if the last index can be reached.
