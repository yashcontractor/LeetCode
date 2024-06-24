class Solution {
    public void moveZeroes(int[] nums) {
        // int[] sortedNums = Arrays.copyOf(nums, nums.length);
        // Arrays.sort(sortedNums);
        int counter = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 0) {
                counter++;
            }
            else if(nums[i] != 0) {
                int number = nums[i];
                nums[i] = 0;
                nums[i-counter] = number;
            }
        }
    }
}