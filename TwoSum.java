import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++)
        {
            int n =  target - nums[i];
            System.out.println(nums[i] + " - "+ n);
            if(map.containsKey(n) && map.get(n) != i )
            {
                res[0] = i;
                res[1] = map.get(n);
                return res;
            }
        }
        return res;
    }
}
