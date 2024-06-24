class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;

        // for(int i = 0; i<n; i++) {
        //     for(int j = i+1; j<n; j++) {
                
        //     }
        // }

        int count = 0;
        int candidate = 0;

        for(int i = 0; i<nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
            }
            if(nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}