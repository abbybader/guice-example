package org.abbullock.pizzaOrder;

public class PaypalCreditCardProcessor extends CreditCardProcessor {
	
	@Override
	public ChargeResult charge(CreditCard creditCard, double amount)
			throws UnreachableException {
		System.out.println("Talking to Paypal");
		
		ChargeResult result;
		if (Math.random() < 0.5) {
			result = ChargeResult.getDeclinedResult("Could not contact Paypal");
		}
		else {
			result = ChargeResult.getSuccessfulResult();
		}
		return result;
	}

}
