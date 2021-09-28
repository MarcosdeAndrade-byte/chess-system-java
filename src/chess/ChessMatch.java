package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;
//ChessMatch jogada de xadrez
public class ChessMatch {
    
	//Atributo do tipo board
	private Board board;

	//Matriz de pe�as do tabuleiro
	// A classe ChessMatch � respons�vel por definir o tamanho do tabuleiro
	//Construtor da classe ChessMatch
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	// O m�todo ChessPiece vai retornar uma matriz de pe�as de xadrez
	//O programa vai ter acesso a camada de xadrez,n�o podendo acessar Piece,mas ChessPiece;
	public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0;i < board.getRows();i++){
        	for(int j = 0;j < board.getColumns();j++)
        		 //Com o Downcasting transformamos as pe�as comuns em pe�as espec�ficas(ChessPiece)
                 mat[i][j] = (ChessPiece) board.piece(i,j);
        }
        //Poss�vel erro
		return mat;
	}
	
	//
	private void placeNewPiece(char column,int row,ChessPiece piece){
		board.placePiece(piece,new ChessPosition(column,row).toPosition());
	}
	
	//
	private void initialSetup(){
		placeNewPiece('b',6, new Rook(board,Color.WHITE));
		placeNewPiece('e',8, new King(board,Color.BLACK));
		placeNewPiece('e',1, new King(board,Color.WHITE));
	}
}
