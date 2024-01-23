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
    public int getWhoseMove() {
        return this.whoseMove;
    }
    public String getXName(String xName) {
        return this.xName;
    }
    public String getOName(String oName) {
        return this.oName;
    }
    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }
    public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
    }
    public boolean isWinner() {
        boolean isWinner = false;
        int tallyCount = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                tallyCount += board[i][j];
            }
            if (tallyCount == 3 || tallyCount == -3) {
                isWinner = true;
            }
        }
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                tallyCount += board[j][i];
            }
            if (tallyCount == 3 || tallyCount == -3) {
                isWinner = true;
            }
        }
        for (int i = 0; i <= 2; i++) {
            tallyCount += board[i][-i + 2];
            if (tallyCount ==3 || tallyCount == -3) {
                isWinner = true;
            }
        }
        return isWinner;
    }
    public boolean isTie() {
        boolean isTie = false;
        for (int i = 0; i <= 2; 
    }
}
