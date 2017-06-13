package ua.com.pahaoks.store.entities.strategies.cashierStrategies;

import ua.com.pahaoks.store.entities.Cashier;
import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Strategy;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public class CashierForPatientCustomerStrategy implements Strategy<Customer> {
    private Cashier cashier;

    public CashierForPatientCustomerStrategy(Cashier cashier) {
        this.cashier = cashier;
    }

    @Override
    public int communicate(Customer receiver) {
        System.out.println("Cashier: We'll be waiting for you next time");
        return cashier.sellGoods(receiver);
    }
}
