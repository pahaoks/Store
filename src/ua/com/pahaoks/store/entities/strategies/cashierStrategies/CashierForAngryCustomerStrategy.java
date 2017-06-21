package ua.com.pahaoks.store.entities.strategies.cashierStrategies;

import ua.com.pahaoks.store.entities.Cashier;
import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Strategy;
import ua.com.pahaoks.store.entities.exceptions.CashierException;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public class CashierForAngryCustomerStrategy implements Strategy<Customer> {
    private Cashier cashier;

    public CashierForAngryCustomerStrategy(Cashier cashier) {
        this.cashier = cashier;
    }

    @Override
    public int communicate(Customer receiver) throws CashierException{
        System.out.println("Cashier: Calm down!!! Be patient");
        return cashier.sellGoods(receiver);
    }
}
