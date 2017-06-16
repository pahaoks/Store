package ua.com.pahaoks.store.entities.stores;

import ua.com.pahaoks.store.entities.CashDesk;
import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Store;
import ua.com.pahaoks.store.entities.cashiers.AbstractCashier;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by lutsishinpa on 15.06.2017.
 */
public class AbstractStore implements Store {
    private final Queue<Customer> customersQueue = new LinkedList<>();

    public AbstractStore(int cashDesks) {
        for (int i = 0; i < cashDesks; i++) {
            new Thread(new CashDesk(AbstractCashier.constructRandomized(), customersQueue, i)).start();
        }
    }

    public static AbstractStore constructRandomized(int cashDesksQty) {
        AbstractStore store = null;
        switch (new Random().nextInt(2)) {
            case 0: return new GroceryStore(cashDesksQty);
            default: return new GroceryStore(cashDesksQty);
        }
    }

    @Override
    public synchronized void newCustomer(Customer customer) {
        customersQueue.offer(customer);
    }
}
