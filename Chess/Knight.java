package Chess;

/*****************************************************************
 Code for the knight, which moves two spaces in a direction and another space perpendicular to that.
 This is the only piece that can jump over others.
 *****************************************************************/
public class Knight extends ChessPiece {

	public Knight(Player player) {
		super(player);
	}

	public String type() {
		return "Knight";
	}

	public boolean isValidMove(Move move, IChessPiece[][] board){

		boolean valid = true;
        // More code is needed
		return valid;
		
	}

}
