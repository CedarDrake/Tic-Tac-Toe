package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    public int getGameState() {
        return this.gameState;
    }
    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }
    public void setXName(String xName) {
        this.xName = xName;
    }
    public void setOName(String oName) {
        this.oName = oName;
    }
    public int getWhoseMove() {
        return this.whoseMove;
    }
    public String getXName() {
        return this.xName;
    }
    public String getOName() {
        return this.oName;
    }
    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }
    public void setBoardCell(int row, int col, int value) {
        this.board[row-1][col-1] = value;
    }
    public boolean isWinner() {
        boolean isWinner = false;
        int winnerCount = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                winnerCount += board[i][j];
            }
            if (winnerCount == 3 || winnerCount == -3) {
                isWinner = true;
            }
        }
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                winnerCount += board[j][i];
            }
            if (winnerCount == 3 || winnerCount == -3) {
                isWinner = true;
            }
        }
        for (int i = 0; i <= 2; i++) {
            winnerCount += board[i][-i + 2];
            if (winnerCount ==3 || winnerCount == -3) {
                isWinner = true;
            }
        }
        return isWinner;
    }
    public boolean isTie() {
        boolean isTie = false;
        int tieCount = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (board[i][j] == 1 || board[i][j] == -1) {
                    tieCount += 1;
                }
            }
        }
        if (tieCount >= 9) {
            isTie = true;
        }
        return isTie;
    }
}
