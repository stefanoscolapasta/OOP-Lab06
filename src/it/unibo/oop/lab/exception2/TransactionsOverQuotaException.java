package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalCallerException{
	private static final long serialVersionUID = -868407748608567066L;
	private final int maxNumTransact;
	
	public TransactionsOverQuotaException(int maxNumTransact) {
		this.maxNumTransact = maxNumTransact;
	}
	
	@Override
	public String toString() {
		return "TransactionsOverQuotaException [maxNumTransact=" + maxNumTransact + "]";
	}	
}
