// Problem Link :- https://leetcode.com/problems/maximum-subarray/submissions/

class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        
        for (int ele : nums) {
            max_ending_here = max_ending_here + ele;
            
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        
        return max_so_far;
    }
}
