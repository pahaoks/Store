package ua.com.pahaoks.store.entities.stores;

import ua.com.pahaoks.store.entities.CashDesk;
import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Store;
import ua.com.pahaoks.store.entities.cashiers.AbstractCashier;
import ua.com.pahaoks.store.entities.exceptions.StoreException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lutsishinpa on 15.06.2017.
 */
public class AbstractStore implements Store, AutoCloseable{
    private final Queue<Customer> customersQueue = new LinkedList<>();

    public AbstractStore(int cashDesks) {
        ExecutorService service = Executors.newFixedThreadPool(cashDesks);

        for (int i = 0; i < cashDesks; i++) {
            service.submit(new CashDesk(AbstractCashier.constructRandomized(), customersQueue, i));
        }

        service.shutdown();
    }

    public static AbstractStore constructRandomized(int cashDesksQty) throws StoreException {
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

    @Override
    public void close() throws Exception {

    }
}
