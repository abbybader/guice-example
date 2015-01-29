package org.abbullock.pizzaOrder;

public class ChargeResult {
	
	private final boolean successful;
	private final String declinedMessage;
	
	public static ChargeResult getSuccessfulResult() {
		return new ChargeResult(null, true);
	}
	
	public static ChargeResult getDeclinedResult(String declinedMessage) {
		return new ChargeResult(declinedMessage, true);
	}
	
	private ChargeResult(String message, boolean successful) {
		this.successful = successful;
		this.declinedMessage = message;
	}

	public boolean wasSuccessful() {
		return successful;
	}

	public String getDeclineMessage() {
		 return declinedMessage;
	}
	
	@Override
	public String toString() {
		if (successful) {
			return "Successful transaction";
		}
		return "Unsuccessful transaction: " + declinedMessage;
	}

}
