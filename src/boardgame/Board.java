package boardgame;

public class Board {

	// Atributos(Linhas/Colunas/Matriz de peças)
	private int rows;
	private int columns;
	private Piece[][] pieces;

	// Construtor
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		
		this.rows = rows;
		this.columns = columns;
		// Peças recebem número de linhas e número de colunas da classe ChessMatch
		pieces = new Piece[rows][columns];
	}

	// Getters and Setters
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	//retorna uma matriz do tipo peça 
	public Piece piece(int row, int column) {
		if(!positionExists(row,column)){
			throw new BoardException("Position on the board");
		}
		return pieces[row][column];
	}

	//Retorna a peça que estiver na linha e na coluna indicada
	public Piece piece(Position position) {
		if(!positionExists(position)){
			throw new BoardException("Position on the board");
	}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//O método placePiece atribui a peça indicada à matriz
	//temos como argumento piece do tipo Piece(Que foi declarado nos atributos)
	//temos como argumento position do tipo Position(Que é uma classe Position)
	public void placePiece(Piece piece,Position position){
		if(thereIsAPiece(position)){
			throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	//O método vai retornar falso ou verdadeiro
	private boolean positionExists(int row,int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	//O método reaproveita positionExists e de acordo com as cordenadas retorna se existe ou não
	public boolean positionExists(Position position){
		return positionExists(position.getRow(),position.getColumn());
	}
	
	//O método identifica uma peça na posição idicada pela função position
	public boolean thereIsAPiece(Position position){
		if(!positionExists(position)){
			throw new BoardException("Position on the board");
	}
		return piece(position) != null;
	}
}
