
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length==0)
            return 0;
        int[] _map = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int pos=0; pos<nums.length; pos++){
            for (int cmp=pos-1; cmp>=-1; cmp--){
                if (cmp==-1 && _map[pos]==0){
                    _map[pos] = 1;
                    max = Math.max(_map[pos], max);
                }
                if (cmp>=0 && nums[cmp]<nums[pos]){
                    _map[pos] = Math.max(_map[pos], _map[cmp]+1);
                    max = Math.max(_map[pos], max);
                }
            }
        }
        return max;
    }
}