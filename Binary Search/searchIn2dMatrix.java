// Problem Link :- https://leetcode.com/problems/search-a-2d-matrix/submissions/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = 0;
        boolean isFound = false;
        
        for (i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][matrix[0].length-1]) {
                isFound = binarySearch(matrix, i, target);
                
                if (isFound) {
                    break;
                }
            }
        }
        
        if (isFound) {
            return true;
        }
        
        return false;
    }
    
    public boolean binarySearch(int[][] matrix, int row, int target) {
        int start = 0, mid = 0, end = matrix[0].length - 1;
        
        while (start <= end) {
            mid = start + (end - start) / 2;
            
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                start = mid + 1;
            } else if (matrix[row][mid] > target) {
                end = mid - 1;
            }
        }
        
        return false;
    }
}
