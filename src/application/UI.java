package application;

import chess.ChessPiece;

public class UI {
    
	/*O m�todo printBoard tem como argumento uma matriz do 
      ChessPiece[][] que tem o nome de pieces*/
	public static void printBoard(ChessPiece[][] pieces){
		for(int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j = 0; j < pieces.length;j++){
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece){
		if(piece == null){
			System.out.print("-");
		}else{
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
