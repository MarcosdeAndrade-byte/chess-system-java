package boardgame;

public abstract class Piece {
	
    // #position:Position
	protected Position position;
	private Board board;
	
	//Construtor
	public Piece(Board board) {
		this.board = board;
	}

	//Getter Board
	protected Board getBoard() {
		return board;
	}
	
	//O método é genérico demais,por isso se tornou abstrato
	public abstract boolean[][] possibleMoves();
	
	//Método retorna o método abstrato
	public boolean possibleMove(Position position){
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//Método para saber se é possível mover a peça
	public boolean isThereAnyPossibleMove(){
		boolean[][] mat = possibleMoves();
		for(int i = 0;i < mat.length;i++){
			for(int j = 0;j < mat.length;j++){
				if(mat[i][j]){
					return true;
				}
			}
		}
		return false;
	}
}
