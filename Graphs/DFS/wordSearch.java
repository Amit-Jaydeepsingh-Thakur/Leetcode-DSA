// Problem :- https://leetcode.com/problems/word-search/submissions/

class Solution {
    public boolean exist(char[][] board, String word) {
        int i = 0, j = 0, row = board.length, col = board[0].length;
        boolean isFound = false;
        boolean[][] visited = new boolean[row][col];
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (word.charAt(0) == board[i][j]) {
                    isFound = search(board, visited, word, i, j, 0);
                    
                    if (isFound) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public boolean search(char[][] board, boolean[][] visited, String word, int i, int j, int start) {
        if (start == word.length()) {
            return true;
        }
        
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || word.charAt(start) != board[i][j]) {
            return false;
        }
        
        visited[i][j] = true;
        
        if (search(board, visited, word, i + 1, j, start + 1) || 
           search(board, visited, word, i - 1, j, start + 1) ||
           search(board, visited, word, i, j + 1, start + 1) ||
           search(board, visited, word, i, j - 1, start + 1)) {
            return true;
        }
        
        visited[i][j] = false;
        
        return false;
    }
}
