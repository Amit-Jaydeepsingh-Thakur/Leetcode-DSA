// Problem Link :- https://leetcode.com/problems/set-matrix-zeroes/submissions/

class Solution {
    public void setZeroes(int[][] matrix) {
        int i = 0, j = 0, row = matrix.length, column = matrix[0].length;
        
        // First Traversal
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    _SetZerosInMatrix(matrix, row, column, i, j);
                }
            }
        }
        
        // Second Traversal
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE - 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    public void _SetZerosInMatrix(int [][] matrix, int row, int col, int rowPos, int colPos) {
        int i = 0, j = 0;
        
        // Left Traversal
        for (i = colPos; i >= 0; i--) {
            if (matrix[rowPos][i] != 0)
                matrix[rowPos][i] = Integer.MAX_VALUE - 1;
        }
        
        // Right Traversal
        for (i = colPos; i < col; i++) {
            if (matrix[rowPos][i] != 0)
                matrix[rowPos][i] = Integer.MAX_VALUE - 1;
        }
        
        // Upward Traversal
        for (i = rowPos; i >= 0; i--) {
            if (matrix[i][colPos] != 0)
                matrix[i][colPos] = Integer.MAX_VALUE - 1;
        }
        
        // Downward Traversal
        for (i = rowPos; i < row; i++) {
            if (matrix[i][colPos] != 0)
                matrix[i][colPos] = Integer.MAX_VALUE - 1;
        }
    }
}
