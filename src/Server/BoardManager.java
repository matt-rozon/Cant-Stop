/**
 * 
 */
package Server;

/**
 * @author Administrator
 *
 */
public class BoardManager {
	private int tempCounter;
	private GamePiece[][] boardCol2;
	private GamePiece[][] boardCol3;
	private GamePiece[][] boardCol4;
	private GamePiece[][] boardCol5;
	private GamePiece[][] boardCol6;
	private GamePiece[][] boardCol7;
	private GamePiece[][] boardCol8;
	private GamePiece[][] boardCol9;
	private GamePiece[][] boardCol10;
	private GamePiece[][] boardCol11;
	private GamePiece[][] boardCol12;
	
	public BoardManager(){
		boardCol2 = new GamePiece[3][2];
		boardCol3 = new GamePiece[5][2];
		boardCol4 = new GamePiece[7][2];
		boardCol5 = new GamePiece[9][2];
		boardCol6 = new GamePiece[11][2];
		boardCol7 = new GamePiece[13][2];
		boardCol8 = new GamePiece[11][2];
		boardCol9 = new GamePiece[9][2];
		boardCol10 = new GamePiece[7][2];
		boardCol11 = new GamePiece[5][2];
		boardCol12 = new GamePiece[3][2];
	}
	
	public boolean addPiece(int columnNum, boolean X, int player){
		GamePiece newIn = new GamePiece(X, player);
		if(columnNum >= 2 && columnNum <= 12){
			switch (columnNum){
				case 2: boardCol2[0][player-1] = newIn;
					break; 
				case 3: boardCol3[0][player-1] = newIn;
					break;
				case 4: boardCol4[0][player-1] = newIn;
					break;
				case 5: boardCol5[0][player-1] = newIn;
					break;
				case 6: boardCol6[0][player-1] = newIn;
					break;
				case 7: boardCol7[0][player-1] = newIn;
					break;
				case 8: boardCol8[0][player-1] = newIn;
					break;
				case 9: boardCol9[0][player-1] = newIn;
					break;
				case 10: boardCol10[0][player-1] = newIn;
					break;
				case 11: boardCol11[0][player-1] = newIn;
					break;
				case 12: boardCol12[0][player-1] = newIn;
					break;
				}
			return true;
			}
			else
				return false;		
	}
	
	public boolean removePiece(int columnNum, boolean X int player){
		if(columnNum >= 2 && columnNum <= 12){
			switch (columnNum){
				case 2: boardCol2[0][player] = null;
					break; 
				case 3: boardCol3[0][player] = null;
					break;
				case 4: boardCol4[0][player] = null;
					break;
				case 5: boardCol5[0][player] = newIn;
					break;
				case 6: boardCol6[0][player] = newIn;
					break;
				case 7: boardCol7[0][player] = newIn;
					break;
				case 8: boardCol8[0][player] = newIn;
					break;
				case 9: boardCol9[0][player] = newIn;
					break;
				case 10: boardCol10[0][player] = newIn;
					break;
				case 11: boardCol11[0][player] = newIn;
					break;
				case 12: boardCol12[0][player] = newIn;
					break;
				}
			return true;
			}
			else
				return false;		
		
	}
	
	
}
