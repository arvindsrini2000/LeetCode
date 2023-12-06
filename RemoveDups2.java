import java.util.*;

//Medium

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n : nums){
            if(i < 2 || n > nums[i-2]){
                nums[i] = n;
                i++;
            }
        }
        return i;
    }

    //0,0,1,1,1,1,2,3,3
    //In this Eg, Use the regular technique. keep the i(Slow pointer) holded at the index where exactly counter is 2 or lessthan 2.
}
