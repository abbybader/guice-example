package org.abbullock.pizzaOrder;

public class CreditCardProcessor {

	public ChargeResult charge(CreditCard creditCard, double amount) throws UnreachableException {
		System.out.println("Talking to processing database server thing");
		
		ChargeResult result;
		if (Math.random() < 0.5) {
			result = ChargeResult.getDeclinedResult("Could not contact server");
		}
		else {
			result = ChargeResult.getSuccessfulResult();
		}
		return result;
	}

}
