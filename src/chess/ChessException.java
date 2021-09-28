package chess;

public class ChessException extends RuntimeException{
	private static final long serialVersionUID = 1L;
    
	//Armazena a mensagem de erro
	public ChessException(String msg){
		super(msg);
	}
}
