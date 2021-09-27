package chess;

import boardgame.Board;

public class ChessMatch {
    
	//Atributo do tipo board
	private Board board;

	//Matriz de pessas do tabuleiro
	// A classe ChessMatch é responsável por definir o tamanho do tabuleiro
	public ChessMatch() {
		board = new Board(8, 8);
	}

	// O método ChessPiece vai retornar uma matriz de peças de xadrez
	//O programa vai ter acesso a camada de xadrez,não podendo acessar Piece,mas ChessPiece;
	public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0;i < board.getRows();i++){
        	for(int j = 0;j < board.getColumns();j++)
        		 //Com o Downcasting transformamos as peças comuns em peças específicas(ChessPiece)
                 mat[i][j] = (ChessPiece) board.piece(i,j);
        }
        //Possível erro
		return mat;
	}
}
