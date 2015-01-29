package org.abbullock.pizzaOrder;

import java.util.Date;
import java.util.List;


public class Receipt {
	
	private final Date transactionDate;
	private final double amount;

	public static Receipt forSuccessfulCharge(double amount) {
		
		return null;
	}

	public static Receipt forDeclinedCharge(String declineMessage) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Receipt forSystemFailure(String message) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Receipt(double amount) {
		this.amount = amount;
		transactionDate = new Date(System.currentTimeMillis());
	}

}
