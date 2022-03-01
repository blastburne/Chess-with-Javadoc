package Chess;

/*****************************************************************
 Code for the king piece, which moves any direction one space at a time. The game is lost if the king gets captured.
 *****************************************************************/
public class King extends ChessPiece {

	public King(Player player) {
		super(player);
	}

	public String type() {
		return "King";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		boolean valid = true;
        // More code is needed
		return valid;
	}
}
