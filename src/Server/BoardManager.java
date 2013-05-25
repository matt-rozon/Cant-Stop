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
	
	public boolean addPiece(int rowNum, int columnNum, boolean perm, int player){
		GamePiece newIn = new GamePiece(perm, player);
		int highestRow = 0;
		if(columnNum >= 2 && columnNum <= 12){
			switch (columnNum){
				case 2:
					for(int i = 0; i < boardCol2.length; i++)
						if(boardCol2[i][player-1] != null && boardCol2[i][player-1].getPerm())
							highestRow = i;
					if(highestRow > rowNum)
						boardCol2[highestRow][player-1] = newIn;
					else if(rowNum+1 > boardCol2.length)
						boardCol2[rowNum+1][player-1] = newIn;
					else
						boardCol2[rowNum][player-1] = newIn;
					tempCounter++;
					break; 
				case 3:
					for(int i = 0; i < boardCol3.length; i++)
						if(boardCol3[i][player-1] != null)
							rowNum = i;
					boardCol3[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 4:
					for(int i = 0; i < boardCol4.length; i++)
						if(boardCol4[i][player-1] != null)
							rowNum = i;
					boardCol4[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 5:
					for(int i = 0; i < boardCol5.length; i++)
						if(boardCol5[i][player-1] != null)
							rowNum = i;
					boardCol5[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 6:
					for(int i = 0; i < boardCol6.length; i++)
						if(boardCol6[i][player-1] != null)
							rowNum = i;
					boardCol6[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 7:
					for(int i = 0; i < boardCol7.length; i++)
						if(boardCol7[i][player-1] != null)
							rowNum = i;
					boardCol7[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 8:
					for(int i = 0; i < boardCol8.length; i++)
						if(boardCol8[i][player-1] != null)
							rowNum = i;
					boardCol8[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 9:
					for(int i = 0; i < boardCol9.length; i++)
						if(boardCol9[i][player-1] != null)
							rowNum = i;
					boardCol9[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 10:
					for(int i = 0; i < boardCol10.length; i++)
						if(boardCol10[i][player-1] != null)
							rowNum = i;
					boardCol10[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 11:
					for(int i = 0; i < boardCol11.length; i++)
						if(boardCol11[i][player-1] != null)
							rowNum = i;
					boardCol11[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				case 12:
					for(int i = 0; i < boardCol12.length; i++)
						if(boardCol12[i][player-1] != null)
							rowNum = i;
					boardCol12[rowNum+1][player-1] = newIn;
					tempCounter++;
					break;
				}
			return true;
			}
			else
				return false;		
	}
	
	public int removePiece(int columnNum, int player){
		int row = -1;
		if(columnNum >= 2 && columnNum <= 12){
			switch (columnNum){
				case 2:
					for(int i = 0; i < boardCol2.length; i++)
						if(boardCol2[i][player-1] != null && !boardCol2[i][player-1].getPerm())
							row = i;
					if(row>= -1){
						boardCol2[row][player] = null;
						tempCounter--;
					}
					break; 
				case 3:
					for(int i = 0; i < boardCol3.length; i++)
						if(boardCol3[i][player-1] != null && !boardCol3[i][player-1].getPerm())
							row = i;
					boardCol3[row][player] = null;
					tempCounter--;
					break;
				case 4: for(int i = 0; i < boardCol4.length; i++)
					if(boardCol4[i][player-1] != null && !boardCol4[i][player-1].getPerm())
						row = i;
					boardCol4[row][player] = null;
					tempCounter--;
					break;
				case 5:
					for(int i = 0; i < boardCol5.length; i++)
					if(boardCol5[i][player-1] != null && !boardCol5[i][player-1].getPerm())
						row = i;
					boardCol5[row][player] = null;
					tempCounter--;
					break;
				case 6:
					for(int i = 0; i < boardCol6.length; i++)
						if(boardCol6[i][player-1] != null && !boardCol6[i][player-1].getPerm())
							row = i;
					boardCol6[row][player] = null;
					tempCounter--;
					break;
				case 7:
					for(int i = 0; i < boardCol7.length; i++)
						if(boardCol7[i][player-1] != null && !boardCol7[i][player-1].getPerm())
							row = i;
					boardCol7[row][player] = null;
					tempCounter--;
					break;
				case 8: 
					for(int i = 0; i < boardCol8.length; i++)
						if(boardCol8[i][player-1] != null && !boardCol8[i][player-1].getPerm())
							row = i;
					boardCol8[row][player] = null;
					tempCounter--;
					break;
				case 9: 
					for(int i = 0; i < boardCol9.length; i++)
						if(boardCol9[i][player-1] != null && !boardCol9[i][player-1].getPerm())
							row = i;
					boardCol9[row][player] = null;
					tempCounter--;
					break;
				case 10: 
					for(int i = 0; i < boardCol10.length; i++)
						if(boardCol10[i][player-1] != null && !boardCol10[i][player-1].getPerm())
							row = i;
					boardCol10[row][player] = null;
					tempCounter--;
					break;
				case 11: 
					for(int i = 0; i < boardCol11.length; i++)
						if(boardCol11[i][player-1] != null && !boardCol11[i][player-1].getPerm())
							row = i;
					boardCol11[row][player] = null;
					tempCounter--;
					break;
				case 12: 
					for(int i = 0; i < boardCol12.length; i++)
						if(boardCol12[i][player-1] != null && !boardCol12[i][player-1].getPerm())
							row = i;
					boardCol12[row][player] = null;
					tempCounter--;
					break;
			}
		}
		return row;
	}
	
	public void tempToPerm(int player){
		int row = -1;
		for(int i = 0; i < boardCol2.length; i++)
			if(boardCol2[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol2[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol3.length; i++)
			if(boardCol3[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol3[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol4.length; i++)
			if(boardCol4[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol4[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol5.length; i++)
			if(boardCol5[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol5[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol6.length; i++)
			if(boardCol6[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol6[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol7.length; i++)
			if(boardCol7[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol7[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol8.length; i++)
			if(boardCol8[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol8[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol9.length; i++)
			if(boardCol9[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol9[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol10.length; i++)
			if(boardCol10[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol10[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol11.length; i++)
			if(boardCol11[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol11[row+1][player-1].setPerm(true);
			row = -1;
		}
		
		for(int i = 0; i < boardCol12.length; i++)
			if(boardCol12[i][player-1] != null)
				row = i;
		if(row > -1){
			boardCol12[row+1][player-1].setPerm(true);
			row = -1;
		}
		
	}
	
	public boolean winCheck(int player){
		int conquered = 0;
		if(boardCol2[boardCol2.length-1][player] != null)
			if(boardCol2[boardCol2.length-1][player].getPerm())
				conquered++;
		
		if(boardCol3[boardCol3.length-1][player] != null)
			if(boardCol3[boardCol3.length-1][player].getPerm())
				conquered++;
		
		if(boardCol4[boardCol4.length-1][player] != null)
			if(boardCol4[boardCol4.length-1][player].getPerm())
				conquered++;
		
		if(boardCol5[boardCol5.length-1][player] != null)
			if(boardCol5[boardCol5.length-1][player].getPerm())
				conquered++;
		
		if(boardCol6[boardCol6.length-1][player] != null)
			if(boardCol6[boardCol6.length-1][player].getPerm())
				conquered++;
		
		if(boardCol7[boardCol7.length-1][player] != null)
			if(boardCol7[boardCol7.length-1][player].getPerm())
				conquered++;
		
		if(boardCol8[boardCol8.length-1][player] != null)
			if(boardCol8[boardCol8.length-1][player].getPerm())
				conquered++;
		
		if(boardCol9[boardCol9.length-1][player] != null)
			if(boardCol9[boardCol9.length-1][player].getPerm())
				conquered++;
		
		if(boardCol10[boardCol10.length-1][player] != null)
			if(boardCol10[boardCol10.length-1][player].getPerm())
				conquered++;
		
		if(boardCol11[boardCol11.length-1][player] != null)
			if(boardCol11[boardCol11.length-1][player].getPerm())
				conquered++;
		
		if(boardCol12[boardCol12.length-1][player] != null)
			if(boardCol12[boardCol12.length-1][player].getPerm())
				conquered++;

		if(conquered >= 3)
			return true;
		else
			return false;
	}
	
	public boolean checkConquered(int columnNum){
		if(columnNum >= 2 && columnNum <= 12){
			switch (columnNum){
			case 2:
				if(boardCol2[boardCol2.length-1][0].getPerm())
					return true;
				if(boardCol2[boardCol2.length-1][1].getPerm())
					return true;
			case 3:
				if(boardCol3[boardCol3.length-1][0].getPerm())
					return true;
				if(boardCol3[boardCol3.length-1][1].getPerm())
					return true;
			case 4:
				if(boardCol4[boardCol4.length-1][0].getPerm())
					return true;
				if(boardCol4[boardCol4.length-1][1].getPerm())
					return true;
			case 5:
				if(boardCol5[boardCol5.length-1][0].getPerm())
					return true;
				if(boardCol5[boardCol5.length-1][1].getPerm())
					return true;
			case 6:
				if(boardCol6[boardCol6.length-1][0].getPerm())
					return true;
				if(boardCol6[boardCol6.length-1][1].getPerm())
					return true;
			case 7:
				if(boardCol7[boardCol7.length-1][0].getPerm())
					return true;
				if(boardCol7[boardCol7.length-1][1].getPerm())
					return true;
			case 8:
				if(boardCol8[boardCol8.length-1][0].getPerm())
					return true;
				if(boardCol8[boardCol8.length-1][1].getPerm())
					return true;
			case 9:
				if(boardCol9[boardCol9.length-1][0].getPerm())
					return true;
				if(boardCol9[boardCol9.length-1][1].getPerm())
					return true;
			case 10:
				if(boardCol10[boardCol10.length-1][0].getPerm())
					return true;
				if(boardCol10[boardCol10.length-1][1].getPerm())
					return true;
			case 11:
				if(boardCol11[boardCol11.length-1][0].getPerm())
					return true;
				if(boardCol11[boardCol11.length-1][1].getPerm())
					return true;
			case 12:
				if(boardCol12[boardCol12.length-1][0].getPerm())
					return true;
				if(boardCol12[boardCol12.length-1][1].getPerm())
					return true;
			}
		}
		return false;
	}
	public int getCounter(){
		return tempCounter;
	}
}
