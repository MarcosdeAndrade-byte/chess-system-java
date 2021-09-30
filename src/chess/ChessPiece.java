package chess;

import boardgame.Board;
import boardgame.Piece;

//ChessPiece herda os atributos Piece
public abstract class ChessPiece extends Piece {
	
	// Atributo do tipo cor
	private Color color;

	// Construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	// Get do tipo color
	public Color getColor() {
		return color;
	}

	
}
