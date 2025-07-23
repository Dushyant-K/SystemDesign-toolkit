package Tic_Tac_Toe;
import static java.lang.Math.abs;

public class TicTacToe {
	private final int[][] board;
	private final int n;
	private int [] rowSum, colSum;
	private int diagSum, revDiagSum;
	private int winner;
	
	public TicTacToe(int n) {
		this.n=n;
		board = new int[n][n];
		rowSum=new int[n];
		colSum=new int[n];
	}
	
	/**
	 * Makes a move on the board and returns the winner if the 
	 * move is a winning Move.
	 * @param player is either 0 or 1.
	 * @param row is the row's move index
	 * @param col is the col's move index
	 * @return winner +1 if the first player wins, -1 if the second player wins, 0 otherwise.
	 * @throws IllegalArgumentException if the move is an illegal move
	 */
	
	public int move(int player, int row, int col) throws IllegalArgumentException{
		if(row<0||row>=n||col<=0||col>=n) {
			throw new IllegalArgumentException("Move out of board boundary");
		}
		if(board[row][col]!=0) {
			throw new IllegalArgumentException("Square is Already Occupied");
		}
		if(player!=0&&player!=1) {
			throw new IllegalArgumentException("Invalid Player");
		}
		if(getWinner()!=0) {
			return player;
		}
		player=player==0?-1:+1;
		
		board[row][col]=player;
		rowSum[row]+=player;
		colSum[col]+=player;
		if(row==col) {
			diagSum+=player;
		}
		if(row==n-col-1) {
			revDiagSum+=player;
		}
		if(rowSum[row]==abs(n)||colSum[col]==abs(n)||diagSum==abs(n)||revDiagSum==abs(n)) {
			winner = player;
		}
		return getWinner();
	}
	public int getWinner() {
		return winner;
	}
}
