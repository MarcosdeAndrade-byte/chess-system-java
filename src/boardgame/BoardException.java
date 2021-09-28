package boardgame;

public class BoardException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	//Construtor para receber mensagens
	public BoardException(String msg) {
		super(msg);
	}
	
}
