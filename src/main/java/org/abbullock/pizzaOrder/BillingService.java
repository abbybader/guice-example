package org.abbullock.pizzaOrder;

public interface BillingService {
	Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);
}
