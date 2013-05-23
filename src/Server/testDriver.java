package Server;

import java.util.Scanner;

public class testDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		String cont = sc.nextLine();
		while(cont.equals("y")){
			System.out.println(dice.rollDice());
			System.out.println(dice.checkLastSums(sc.nextLine()));
			cont = sc.nextLine();
		}
		GamePiece test = new GamePiece(true, 1);
		System.out.println(test.getPerm());
		System.out.println(test.getOwner());
		
		
	}

}
