class Solution {
public int majorityElement(int[] nums) {
    int n = nums.length;
    int majorityCount = n / 2;

    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] == nums[i]) {
                count++;
            }
        }
        if (count > majorityCount) {
            return nums[i];
        }
    }
    return -1; // This line would never be reached if we assume there is always a majority element
}
}