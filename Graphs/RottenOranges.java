// Problem :- https://leetcode.com/problems/rotting-oranges/

class Solution {
    public int orangesRotting(int[][] grid) {
        int i = 0, j = 0, x = 0, y = 0, fresh = 0, times = 0, size = 0, row = grid.length, col = grid[0].length;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        
        if (fresh == 0) {
            return 0;
        }
        
        while (!q.isEmpty()) {
            size = q.size();
            times++;
            
            for (i = 1; i <= size; i++) {
                int[] steps = q.poll();
                
                for (int[] dir : dirs) {
                    x = steps[0] + dir[0];
                    y = steps[1] + dir[1];
                    
                    if (x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 2 || grid[x][y] == 0) {
                        continue;
                    }
                    
                    grid[x][y] = 2;
                    
                    q.offer(new int[]{x, y});
                    
                    fresh--;
                }
            }
        }
        
        if (fresh == 0) {
            return (times - 1);
        }
        
        return -1;
        
    }
}
