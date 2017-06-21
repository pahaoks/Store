package ua.com.pahaoks.store.entities.strategies.customerStrategies;

import ua.com.pahaoks.store.entities.Cashier;
import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Strategy;
import ua.com.pahaoks.store.entities.exceptions.CustomerException;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public class CustomerForFastCashierStrategy implements Strategy<Cashier> {
    private Customer customer;

    public CustomerForFastCashierStrategy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int communicate(Cashier receiver) throws CustomerException {
        System.out.println("Customer: Good job, you are very fast");
        return customer.buyGoods();
    }
}
