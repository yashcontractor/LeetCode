class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;

        // for(int i = 0; i<n; i++) {
        //     for(int j = i+1; j<n; j++) {
                
        //     }
        // }


        //more voting algorithm or brute force
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

        //The way I was thinking about it (brute force):
//         public int majorityElement(int[] nums) {
//     int n = nums.length;
//     int majorityCount = n / 2;

//     for (int i = 0; i < n; i++) {
//         int count = 0;
//         for (int j = 0; j < n; j++) {
//             if (nums[j] == nums[i]) {
//                 count++;
//             }
//         }
//         if (count > majorityCount) {
//             return nums[i];
//         }
//     }
//     return -1;
// }
    }
}