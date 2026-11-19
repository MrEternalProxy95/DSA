class Solution {
    public int[] twoSum(int[] nums, int target) {
        var res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res.add(i);
                    res.add(j);
                }
            }
        }
        int[] R = new int[res.size()];
        for(int i=0;i<res.size();i++){
            R[i]=res.get(i);
        }
        return R;
    }
}