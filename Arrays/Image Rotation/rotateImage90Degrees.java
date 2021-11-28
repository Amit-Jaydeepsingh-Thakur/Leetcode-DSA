// Problem link :- https://leetcode.com/problems/rotate-image/submissions/

class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        
        for (int row = 0; row < matrix.length; row++) {
            int i = 0;
            int j = matrix[row].length - 1;
            
            while (i < j) {
                int temp = matrix[row][i];
                matrix[row][i++] = matrix[row][j];
                matrix[row][j--] = temp;
            }
        }
    }
    
    public void transpose(int[][] image) {
        for (int  i = 0; i < image.length; i++) {
            for (int j = i + 1; j < image[i].length; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }
    }
}
