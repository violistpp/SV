package david.sudoku;

public class Sudoku {

    public boolean validSolution(int[][] board) {
        boolean noZero = true;
        boolean check[];
        // Check for zeroes
        for(int i = 0; i < 9 && noZero; i++) {
            for(int j = 0; j < 9 && noZero; j++) {
                if(board[i][j] == 0) {
                    noZero = false;
                    break;
                }
            }
        }

        if(noZero) {
            for(int i = 0; i < 9; i++) {
                check = new boolean[9];
                for(int j = 0; j < 9; j++) {
                    int val = board[i][j];
                    if(!check[val-1]) { // if number are first on column
                        check[val-1] = true;
                    } else {
                        noZero = false;
                        break;
                    }
                }
                check = new boolean[9];
                for(int j = 0; j < 9; j++) {
                    int val = board[j][i];
                    if(!check[val-1]) { // if number are first on row
                        check[val-1] = true;
                    } else {
                        noZero = false;
                        break;
                    }
                }
            }
        }

        return noZero;
    }

}
