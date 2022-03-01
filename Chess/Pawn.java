package Chess;

/*****************************************************************
 Code for the pawn piece, which can only move directly forward unless capturing.
 The pawn captures a piece one space ahead and one space to the side of it, shifting it sideways.
 *****************************************************************/
public class Pawn extends ChessPiece {

	public Pawn(Player player) {
		super(player);
	}

	public String type() {
		return "Pawn";
	}

	// determines if the move is valid for a pawn piece
	public boolean isValidMove(Move move, IChessPiece[][] board) {

		boolean valid = true;
        // More code is needed
		return valid;
	}
}
