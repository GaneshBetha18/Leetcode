class Solution {
    public void solveSudoku(char[][] board) {
        solve1(board,0,0);
    }

    static boolean solve1(char[][] board,int row,int col){
        if(row == 9){
            Display(board);
            return true;
        }

        if(col == 9){
           return solve1(board,row+1,0);

        }
        if (board[row][col] != '.') {
            return solve1(board, row, col + 1);

        }

        for(int i=1;i<10;i++){
            if(isSafe(board,row,col,i)){
                board[row][col] =(char)(i + '0');
                if(solve1(board,row,col+1)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    static void Display(char[][] board) {
        for(char[] row : board){
            for(char col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
        // for row
        for (char[] chars : board) {
            if (chars[col] == n + '0') {
                return false;
            }
        }

        // for colm
        for(int i=0;i< board.length;i++){
            if(board[row][i] == n + '0'){
                return false;
            }
        }

        // for box
        int a = (col/3)*3;
        int b = (row/3)*3;
        for(int j=b;j<b+3;j++) {
            for (int i = a; i < a + 3; i++) {
                if(board[j][i] == n+'0'){
                    return false;
                }
            }
        }

        return true;
    }
}