package ua.com.pahaoks.store.program;

import ua.com.pahaoks.store.entities.CashDesk;
import ua.com.pahaoks.store.entities.cashiers.AbstractCashier;
import ua.com.pahaoks.store.entities.cashiers.FastCashier;
import ua.com.pahaoks.store.entities.customers.AbstractCustomer;
import ua.com.pahaoks.store.entities.stores.AbstractStore;

/**
 * Created by lutsishinpa on 14.06.2017.
 */
public class Main {
    public static void main(String[] args) {

        AbstractStore store = AbstractStore.constructRandomized(10);

        for (int i = 0; i < 50; i++) {
            store.newCustomer(AbstractCustomer.constructRandomized());
        }
    }
}
