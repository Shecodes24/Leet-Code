class Solution {
    public int maxSubArray(int[] nums) {
        int maxval = Integer.MIN_VALUE;
        int flag = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > -1)
            {
                flag = 1;
                break;
            }
            if(nums[i] > maxval)
            {
                maxval = nums[i];
            }
        }

        if(flag == 0)
        {
            return maxval;
        }

        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            cs += nums[i];
            if(cs < 0)
            {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }
}
