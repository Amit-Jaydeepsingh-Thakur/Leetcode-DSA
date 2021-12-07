// Problem :- https://leetcode.com/problems/missing-number/submissions/

class Solution {
    public int missingNumber(int[] nums) {
        int missingNumber = -1, size = nums.length;
        
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != (nums[i - 1] + 1)) {
                missingNumber = nums[i - 1] + 1;
                break;
            }
        }
        
        if (missingNumber == -1 && nums[size - 1] == size) {
            return 0;
        } else if (missingNumber == -1) {
            return nums.length;
        }
        
        
        return missingNumber;
    }
}
