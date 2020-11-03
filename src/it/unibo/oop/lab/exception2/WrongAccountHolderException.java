package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalAccessError {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8097697224304503570L;
	private final int mistakenID;
	
	public WrongAccountHolderException(int mistakenID) {
		this.mistakenID = mistakenID;
	}

	@Override
	public String toString() {
		return "WrongAccountHolderException [mistakenAccount=" + mistakenID + "]";
	}
	
}
