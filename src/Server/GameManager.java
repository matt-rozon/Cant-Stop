/**
 * 
 */
package Server;

/**
 * @author Administrator
 *
 */
import java.util.Scanner;

public class GameManager {
	private BoardManager board;
	private Dice dice;
	private int player;
	
	/**
	 * Class constructor.
	 */
	public GameManager(){
		board = new BoardManager();
		dice = new Dice();
		player = 1;
	}
	
	public String movePiece(String choices){
		if(dice.checkLastSums(choices)){
			Scanner sc = new Scanner(choices);
			sc.useDelimiter(", ");
			int choiceOne = sc.nextInt();
			int choiceTwo = sc.nextInt();
			int removed;
			if(board.getCounter() <= 3){
				if(board.checkConquered(choiceOne))
					return "err";
				removed = board.removePiece(choiceOne, player);
				board.addPiece(removed, choiceOne, false, player);
			}
			if(board.getCounter() <= 3){
				if(board.checkConquered(choiceOne))
					return "err";
				removed = board.removePiece(choiceTwo, player);
				board.addPiece(removed, choiceTwo, false, player);
			}
			return "ack";
		}
		else
			return "err";
	}
	
	public boolean stopTurn(){
		board.tempToPerm(player);
		if(board.winCheck(player)){
			return true;
		}
		else{
			if(player == 1)
				player = 2;
			else
				player = 1;
			return false;
		}
	}
	
	public boolean crapOut(){
		for(int col = 2; col <= 12; col++){
			board.removePiece(col, player);
		}
		if(player == 1)
			player = 2;
		else
			player = 1;
		return true;
	}
}
