package Chess;

/*****************************************************************
 This class represents the movement of a piece. All pieces use this class to determine where they can and can't go.
 *****************************************************************/
public class Move {
	public int fromRow, fromColumn, toRow, toColumn;

	public Move() {
	}

	public Move(int fromRow, int fromColumn, int toRow, int toColumn) {
		this.fromRow = fromRow;
		this.fromColumn = fromColumn;
		this.toRow = toRow;
		this.toColumn = toColumn;
	}

	@Override
	public String toString() {
		return "Move [fromRow=" + fromRow + ", fromColumn=" + fromColumn + ", toRow=" + toRow + ", toColumn=" + toColumn
				+ "]";
	}
	
	
}
