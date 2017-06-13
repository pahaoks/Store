package ua.com.pahaoks.store.entities;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public class CashDesk implements Runnable {

    private final Queue<Customer> customers = new LinkedList<>();
    private final Cashier cashier;

    public CashDesk(Cashier cashier) {
        this.cashier = cashier;
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void run() {

    }
}
