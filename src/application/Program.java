package application;

import boardgame.Board;
import chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//O método printBoard recebe (matriz de peças) chessMatch.getPieces()
		UI.printBoard(chessMatch.getPieces());
	}
}
