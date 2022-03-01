package Chess;

/*****************************************************************
 Code for the bishop piece, which can move any distance but only diagonally.
 *****************************************************************/
public class Bishop extends ChessPiece {

	public Bishop(Player player) {
		super(player);
	}

	public String type() {
		return "Bishop";
	}

	public boolean isValidMove(Move move, IChessPiece[][] board) {

		return true;
        // More code is needed
		
	}
}
