package application;

import boardgame.Board;
import chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//O m�todo printBoard recebe (matriz de pe�as) chessMatch.getPieces()
		UI.printBoard(chessMatch.getPieces());
	}
}
