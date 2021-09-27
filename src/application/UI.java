package application;

import chess.ChessPiece;

public class UI {
    
	//O método printBoard tem como argumento uma matriz do ChessPiece[][] que tem o nome de pieces
	public static void printBoard(ChessPiece[][] pieces){
		for(int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j = 0; j < pieces.length;j++){
				//O método printPiece é chamado para imprimir a matriz na tela 
				printPiece(pieces[i][j]);
			}
			//Quebra de linha 
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	
	//Método do tipo Void para mudar o conteúdo da peça de acordo com seu conteúdo
	private static void printPiece(ChessPiece piece){
		if(piece == null){
			System.out.print("-");
		}else{
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
