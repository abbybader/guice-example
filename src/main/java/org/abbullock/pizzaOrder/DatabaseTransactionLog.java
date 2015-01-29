package org.abbullock.pizzaOrder;

public class DatabaseTransactionLog implements TransactionLog {
	
	private static final StringBuilder LOG = new StringBuilder();

	public void logChargeResult(ChargeResult result) {
		LOG.append(result.toString());
	}

	public void logConnectException(UnreachableException e) {
		LOG.append(e.toString());
	}
	
	public static void printLogs() {
		System.out.println(LOG.toString());
	}

}
