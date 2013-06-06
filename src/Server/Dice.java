/**
 * 
 */
package Server;

/**
 * The dice created and used by the Can't Stop game.
 * 
 * @author Alexander MacKenzie
 * @author Matthew Rozon
 *
 */
import java.util.Random;
import java.util.Scanner;

public class Dice {
	private int[] rolls;
	private Random generator;
	private Scanner sc;
	
	/**
	 * Class constructor.
	 */
	public Dice(){
		rolls = new int[4];
		generator = new Random();
	}
	
	/**
	 * Generates and stores the user's dice rolls.
	 * 
	 * @return the user's dice rolls
	 */
	public String rollDice(){
		for(int i = 0; i < 4; i++){
			rolls[i] = generator.nextInt(6) + 1;
		}
		return rolls[0] + ", " + rolls[1] + ", " + rolls[2] + ", " + rolls[3];
		/*rolls[0] = generator.nextInt(6) + 1;
		rolls[1] = generator.nextInt(6) + 1;
		rolls[2] = generator.nextInt(6) + 1;
		rolls[3] = generator.nextInt(6) + 1;
		return rolls[0] + ", " + rolls[1] + ", " + rolls[2] + ", " + rolls[3];*/
	}
	
	/**
	 * Checks that the user's move choices are valid.
	 * 
	 * @param choices the user's move choices
	 * @return if the choices are valid
	 */
	public boolean checkLastSums(String choices){
		sc = new Scanner(choices);
		sc.useDelimiter(", ");
		int choiceOne = sc.nextInt();
		int choiceTwo = sc.nextInt();
		
		if((choiceOne == rolls[0] + rolls[1] && choiceTwo == rolls[2] + rolls[3]) ||
				(choiceTwo == rolls[0] + rolls[1] && choiceOne == rolls[2] + rolls[3]))
			return true;
		else if((choiceOne == rolls[0] + rolls[2] && choiceTwo == rolls[1] + rolls[3]) ||
				(choiceTwo == rolls[0] + rolls[2] && choiceOne == rolls[1] + rolls[3]))
			return true;
		else if((choiceOne == rolls[0] + rolls[3] && choiceTwo == rolls[1] + rolls[2]) ||
				(choiceTwo == rolls[0] + rolls[3] && choiceOne == rolls[1] + rolls[2]))
			return true;
		else
			return false;
	}
}
