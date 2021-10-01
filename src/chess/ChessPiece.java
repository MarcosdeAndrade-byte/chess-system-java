package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

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
	
	public ChessPosition getChessPosition(){
		return ChessPosition.fromPosition(position);
	}

	//Método para saber se é um oponente ou não
	protected boolean isThereOpponentPiece(Position position){
		ChessPiece p = (ChessPiece)getBoard().piece(position);
	    return p != null && p.getColor() != color;
	}
}
