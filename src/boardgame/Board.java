package boardgame;

public class Board {

	//Atributos(Linhas/Colunas/Matriz de pe�as)
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Construtor
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//Pe�as recebem linhas e colunas
        pieces = new Piece[rows][columns];
	}
    
	//Getters and Setters
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//O m�todo do tipo pe�a retorna pe�a na posi��o row e column
	public Piece piece(int row,int column){
		return pieces[row][column];
	}
	
	//
	public Piece piece(Position position){
		return pieces[position.getRow()][position.getColumn()];
	}
}
