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
		tempCounter = 0;
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
	
	public boolean addPiece(int columnNum, boolean perm, int player){
		int row = 0;
		GamePiece newIn = new GamePiece(perm, player);
		if(columnNum >= 2 && columnNum <= 12){
			switch (columnNum){
				case 2:
					for(int i = 0; i < boardCol2.length; i++)
						if(boardCol2[i][player-1] != null)
							row = i;
					boardCol2[row+1][player-1] = newIn;					
					break; 
				case 3:
					for(int i = 0; i < boardCol3.length; i++)
						if(boardCol3[i][player-1] != null)
							row = i;
					boardCol3[row+1][player-1] = newIn;
					break;
				case 4:
					for(int i = 0; i < boardCol4.length; i++)
						if(boardCol4[i][player-1] != null)
							row = i;
					boardCol4[row+1][player-1] = newIn;
					break;
				case 5:
					for(int i = 0; i < boardCol5.length; i++)
						if(boardCol5[i][player-1] != null)
							row = i;
					boardCol5[row+1][player-1] = newIn;
					break;
				case 6:
					for(int i = 0; i < boardCol6.length; i++)
						if(boardCol6[i][player-1] != null)
							row = i;
					boardCol6[row+1][player-1] = newIn;
					break;
				case 7:
					for(int i = 0; i < boardCol7.length; i++)
						if(boardCol7[i][player-1] != null)
							row = i;
					boardCol7[row+1][player-1] = newIn;
					break;
				case 8:
					for(int i = 0; i < boardCol8.length; i++)
						if(boardCol8[i][player-1] != null)
							row = i;
					boardCol8[row+1][player-1] = newIn;
					break;
				case 9:
					for(int i = 0; i < boardCol9.length; i++)
						if(boardCol9[i][player-1] != null)
							row = i;
					boardCol9[row+1][player-1] = newIn;
					break;
				case 10:
					for(int i = 0; i < boardCol10.length; i++)
						if(boardCol10[i][player-1] != null)
							row = i;
					boardCol10[row+1][player-1] = newIn;
					break;
				case 11:
					for(int i = 0; i < boardCol11.length; i++)
						if(boardCol11[i][player-1] != null)
							row = i;
					boardCol11[row+1][player-1] = newIn;
					break;
				case 12:
					for(int i = 0; i < boardCol12.length; i++)
						if(boardCol12[i][player-1] != null)
							row = i;
					boardCol12[row+1][player-1] = newIn;
					break;
				}
			return true;
			}
			else
				return false;		
	}
	
	public boolean removePiece(int columnNum, int player){
		if(columnNum >= 2 && columnNum <= 12){
			switch (columnNum){
				case 2:
					for(int i = 0; i < boardCol2.length; i++)
						if(boardCol2[i][player-1] != null)
							row = i;
					boardCol2[0][player] = null;
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
	
	public int getCounter(){
		return tempCounter;
	}
}
