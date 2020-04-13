package D1;

import java.util.HashMap;

public class TwoSumII {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap();
        int[] sol = new int[2];
        for(int i =0; i<nums.length; i++){
            int num = target - nums[i];
            if(set.containsKey(num)){
                sol[0] = set.get(num);
                sol[1] = i;
            }
            else{
                set.put(nums[i],i);
            }
        }
        return sol;
    }
}