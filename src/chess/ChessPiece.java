package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

//ChessPiece herda os atributos Piece
public abstract class ChessPiece extends Piece {
	
	// Atributo do tipo cor
	private Color color;
	private int moveCount;

	// Construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	// Get do tipo color
	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	public ChessPosition getChessPosition(){
		return ChessPosition.fromPosition(position);
	}

	//M�todo para saber se � um oponente ou n�o
	protected boolean isThereOpponentPiece(Position position){
		ChessPiece p = (ChessPiece)getBoard().piece(position);
	    return p != null && p.getColor() != color;
	}
}
