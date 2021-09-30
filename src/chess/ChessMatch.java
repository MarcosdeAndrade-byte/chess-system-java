package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//ChessMatch jogada de xadrez
public class ChessMatch {

	// Atributo do tipo board
	private Board board;

	// Matriz de pe�as do tabuleiro
	// A classe ChessMatch � respons�vel por definir o tamanho do tabuleiro
	// Construtor da classe ChessMatch
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	// O m�todo ChessPiece vai retornar uma matriz de pe�as de xadrez
	// O programa vai ter acesso a camada de xadrez,n�o podendo acessar Piece,mas
	// ChessPiece;
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				// Com o Downcasting transformamos as pe�as comuns em pe�as
				// espec�ficas(ChessPiece)
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		// Poss�vel erro
		return mat;
	}
	
	public boolean[][] possibleMovies(ChessPosition sourcePosition){
		Position position = sourcePosition.toPosition();
		validateSourcePosition(position);
		return board.piece(position).possibleMoves();
	}

	// Deslocamento e poss�vel captura da pe�a
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		// Posi��o de origem e destino
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		// Fun��o para validar a posi��o
		validateSourcePosition(source);
		validateTargetPosition(source,target);
		// makeMove ainda vai ser criada
		Piece capturedPiece = makeMove(source, target);
		return (ChessPiece) capturedPiece;
	}
	
	private void validateTargetPosition(Position source,Position target) {
		//Se para pe�a de origem a posi��o de destino n�o � um movimento poss�vel
		if(!board.piece(source).possibleMove(target)){
			throw new ChessException("The chosen piece can't move to target position");
		}
	}

	private Piece makeMove(Position source, Position target) {
		Piece p = board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(p, target);
		return capturedPiece;
	}

	// Fun��o para validar a posi��o
	private void validateSourcePosition(Position position) {
		if (!board.thereIsAPiece(position)) {
			throw new ChessException("There is no piece on source position");
		}
		if (!board.piece(position).isThereAnyPossibleMove()) {
			// Se n�o tiver nenhum movimento poss�vel
			throw new ChessException("There is no possible moves for the chosen piece");
		}
	}

	// Fun��o para colocar as pe�as no tabuleiro
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	// Pe�as
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
		placeNewPiece('c', 2, new Rook(board, Color.WHITE));
		placeNewPiece('d', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new Rook(board, Color.WHITE));
		placeNewPiece('d', 1, new King(board, Color.WHITE));

		placeNewPiece('c', 7, new Rook(board, Color.BLACK));
		placeNewPiece('c', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
}
