// Problem :- https://leetcode.com/problems/sort-colors/submissions/

class Solution {
    public void sortColors(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0, temp = 0;
        
        while (mid <= end) {
            if (nums[mid] == 0) {
                temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                
                start++;
                mid++;
            } else if (nums[mid] == 2) {
                temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp; 
                
                end--;
            } 
            else {
                mid++;
            }
        }       
    }
}
