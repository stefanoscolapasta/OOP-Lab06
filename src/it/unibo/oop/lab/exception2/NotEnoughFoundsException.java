package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3408942417173680936L;
	
	private final double balance;
	private final double requiredAmount;
	
	public NotEnoughFoundsException(double balance, double requiredAmount) {
		this.balance = balance;
		this.requiredAmount = requiredAmount;
	}

	@Override
	public String toString() {
		return "NotEnoughFoundsException [balance=" + balance + ", requiredAmount=" + requiredAmount + "]";
	}
	
	
}
