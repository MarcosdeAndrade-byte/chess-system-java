package boardgame;

public class Position {
	//Atributos(Linhas e colunas)
	private int row;
	private int column;

	//Construtor
	public Position(){}
	
	//Construtores
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	//Getters and Setters
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
    
	//Método toString
	@Override
	public String toString(){
		return row + ", " + column;
	}
}
