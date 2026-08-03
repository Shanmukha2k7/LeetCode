class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+nums[i]==target){
                a[0]=i-1;
                a[1]=i;
                break;
            }
        }
        return a;
    }
}