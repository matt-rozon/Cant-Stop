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
			if(board.getCounter() <= 3){
				board.removePiece(choiceOne);
				board.addPiece(choiceOne, false, player);
			}
			if(board.getCounter() <= 3){
				board.removePiece(choiceTwo);
				board.addPiece(choiceTwo, false, player);
			}
			return "ack";
		}
		else
			return "err";
	}
	
	public String stopTurn(){
		if(board.winCheck(player)){
			return "winner";
		}
		else{
			int pieces = board.getCounter();
			for(int count = 1; count <= pieces; count++){
				board.removePiece(placeholder, perm, count);
				board.addPiece(columnNum, perm, count);
			}
			if(player == 1)
				player = 2;
			else
				player = 1;
		}
	}
	
	public String crapOut(){
		int pieces = board.getCounter();
		for(int count = 1; count <= pieces; count++){
			board.removePiece(placeholder, perm, count);
			board.addPiece(columnNum, perm, count);
		}
		if(player == 1)
			player = 2;
		else
			player = 1;
	}
}
