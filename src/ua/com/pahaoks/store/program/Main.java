package ua.com.pahaoks.store.program;

import ua.com.pahaoks.store.entities.CashDesk;
import ua.com.pahaoks.store.entities.cashiers.FastCashier;
import ua.com.pahaoks.store.entities.customers.AbstractCustomer;

/**
 * Created by lutsishinpa on 14.06.2017.
 */
public class Main {
    public static void main(String[] args) {

        CashDesk cashDesk = new CashDesk(new FastCashier());

        for (int i = 0; i < 10; i++) {
            cashDesk.addCustomer(AbstractCustomer.constructRandomized());
        }

        cashDesk.run();
    }
}
