package Chess;

/*****************************************************************
Code for the rook, which can move any distance but not diagonally.
 *****************************************************************/
public class Rook extends ChessPiece {

	public Rook(Player player) {
		
		super(player);
		
	}

	public String type() {
		
		return "Rook";
		
	}
	
	// determines if the move is valid for a rook piece
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		
		boolean valid = true;
        // More code is needed
        return valid;
		
	}
	
}
