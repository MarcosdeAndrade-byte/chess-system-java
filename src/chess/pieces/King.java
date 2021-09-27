package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	//Construtor (repassa a chamada para superclasse)
	public King(Board board, Color color) {
		super(board, color);
	}
    
	@Override
    public String toString(){
		return "K";
	}
	
}
