// Problem :- https://leetcode.com/problems/number-of-islands/submissions/

class Solution {
    public int numIslands(char[][] grid) {
        int i = 0, j = 0, noOfIslands = 0, row = grid.length, col = grid[0].length;
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    noOfIslands++;
                    findIslands(grid, i, j, row, col);
                }
            }
        }
       
        return noOfIslands;
    }
    
    public void findIslands(char[][] grid, int i, int j, int row, int col) {
        
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == '0') {
            return;
        }
        
        grid[i][j] = '0';
        
        findIslands(grid, i + 1, j, row, col);
        findIslands(grid, i, j - 1, row, col);
        findIslands(grid, i, j + 1, row, col);
        findIslands(grid, i - 1, j, row, col);
        
    }
}
