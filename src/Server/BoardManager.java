package Server;

/**
 * The game board for the Can't Stop board game. Each player's game pieces
 * are stored and moved by the BoardManager.
 * 
 * @author Alex MacKenzie
 * @author Matthew Rozon
 *
 */
public class BoardManager {
	private int tempCounter;
	private GamePiece[][][] board;
	
	/**
	 * Class constructor.
	 */
	public BoardManager(){
		tempCounter = 0;
		board = new GamePiece[11][][];
		
		board[0] = new GamePiece[3][2];
		board[1] = new GamePiece[5][2];
		board[2] = new GamePiece[7][2];
		board[3] = new GamePiece[9][2];
		board[4] = new GamePiece[11][2];
		board[5] = new GamePiece[13][2];
		board[6] = new GamePiece[11][2];
		board[7] = new GamePiece[9][2];
		board[8] = new GamePiece[7][2];
		board[9] = new GamePiece[5][2];
		board[10] = new GamePiece[3][2];
	}
	
	public boolean addPiece(int rowNum, int columnNum, boolean perm, int player){
		GamePiece newIn = new GamePiece(perm, player);
		int highestRow = 0;
		if(columnNum >= 2 && columnNum <= 12){
			for(int i = 0; i < board[columnNum - 2].length; i++)
				if(board[columnNum - 2][i][player-1] != null && board[columnNum - 2][i][player-1].getPerm())
					highestRow = i;
			if(highestRow > rowNum)
				board[columnNum - 2][highestRow + 1][player-1] = newIn;
			else if(rowNum >= board[columnNum - 2].length)
				return false;
			else if(rowNum == (board[columnNum - 2].length) - 1)
				board[columnNum - 2][rowNum][player-1] = newIn;
			else
				board[columnNum - 2][rowNum + 1][player-1] = newIn;
			tempCounter++;
			return true;
		}			
			else
				return false;		
	}
	
	/**
	 * Removes a temporary game piece from the board.
	 * @param columnNum the board column to be removed from
	 * @param player the player's piece to be removed
	 * @return the row the piece was removed from
	 */
	public int removePiece(int columnNum, int player){
		int row = -1;
		if(columnNum >= 2 && columnNum <= 12){
			for(int i = 0; i < board[columnNum - 2].length; i++)
				if(board[columnNum - 2][i][player-1] != null && !board[columnNum - 2][i][player-1].getPerm())
					row = i;
			if(row > -1){
				board[columnNum - 2][row][player] = null;
				tempCounter--;
			}
		}
		return row;
	}
	
	/**
	 * Makes the player's temporary pieces permanent.
	 * @param player the player's pieces to be changed
	 */
	public void tempToPerm(int player){
		int row = -1;
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++)
				if(board[i][j][player-1] != null)
					row = j;
			if(row > -1){
				board[i][row][player-1].setPerm(true);
				row = -1;
			}
		}
	}
	
	/**
	 * Checks to see if a player has won the game.
	 * @param player the player's pieces to be checked
	 * @return if the player has won
	 */
	public boolean winCheck(int player){
		int conquered = 0;
		for(int i = 0; i < board.length; i++){
			if(board[i][board[i].length-1][player-1] != null)
				if(board[i][board[i].length-1][player-1].getPerm())
					conquered++;
		}
		if(conquered >= 3)
			return true;
		else
			return false;
	}
	
	/**
	 * Checks to see if a given row has been conquered by either player.
	 * @param columnNum the board column to be checked
	 * @return if the column has been conquered
	 */
	public boolean checkConquered(int columnNum){
		if(columnNum >= 2 && columnNum <= 12){
			int i = columnNum - 2;
			if(board[i][board[i].length-1][0] != null)
				if(board[i][board[i].length-1][0].getPerm())
					return true;
			if(board[i][board[i].length-1][1] != null)
				if(board[i][board[i].length-1][1].getPerm())
					return true;
		}
		return false;
	}
	
	/**
	 * Gets the number of temporary game pieces a player has on the board.
	 * @return the number of temporary pieces in play by the player
	 */
	public int getCounter(){
		return tempCounter;
	}
	
	/**
	 * Resets the counter tracking the number of game pieces a player has on the board.
	 */
	public void resetCounter(){
		tempCounter = 0;
	}
}
