package boardgame;

public class Piece {
	
    // #position:Position
	protected Position position;
	private Board board;
	
	//Construtor
	public Piece(Board board) {
		this.board = board;
	}

	//Getter Board
	protected Board getBoard() {
		return board;
	}
}
