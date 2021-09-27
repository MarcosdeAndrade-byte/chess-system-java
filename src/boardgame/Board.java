package boardgame;

public class Board {

	//Atributos(Linhas/Colunas/Matriz de peças)
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Construtor
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//Peças recebem linhas e colunas
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
	
	//O método do tipo peça retorna peça na posição row e column
	public Piece piece(int row,int column){
		return pieces[row][column];
	}
	
	//
	public Piece piece(Position position){
		return pieces[position.getRow()][position.getColumn()];
	}
}
