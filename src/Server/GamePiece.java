package Server;

/**
 * A game piece used by the Can't Stop game to show player progress.
 * 
 * @author AlexanderMacKenzie
 * @author Matthew Rozon
 *
 */
public class GamePiece {
	private boolean permanent;
	private int ownership;
	
	/**
	 * Class constructor.
	 * 
	 * @param perm is the piece permanent
	 * @param own which player owns the piece
	 */
	public GamePiece(boolean perm, int own){
		permanent = perm;
		ownership = own;
	}
	
	/**
	 * Returns if the game piece is permanent.
	 * 
	 * @return is the piece permanent
	 */
	public boolean getPerm(){
		return permanent;
	}
	
	public void setPerm(boolean perm){
		permanent = perm;
	}
	
	/**
	 * Gets the owner of the game piece.
	 * 
	 * @return the owner of the piece
	 */
	public int getOwner(){
		return ownership;
	}
}
