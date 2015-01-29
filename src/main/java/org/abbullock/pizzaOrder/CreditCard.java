package org.abbullock.pizzaOrder;

public class CreditCard {
	
	private final String cardNumber;
	private final String expirationDate;
	private final int ccvCode;
//	private final Customer customer;
	
	public CreditCard(String cardNumber, String expirationDate, int ccvCode) {
		super();
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.ccvCode = ccvCode;
	}
	
}
