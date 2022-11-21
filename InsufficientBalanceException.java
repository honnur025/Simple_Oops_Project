package BasicOopsProject;

public class InsufficientBalanceException extends RuntimeException{
	private String message;

	public InsufficientBalanceException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
