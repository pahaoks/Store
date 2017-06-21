package ua.com.pahaoks.store.program;

import ua.com.pahaoks.store.entities.CashDesk;
import ua.com.pahaoks.store.entities.cashiers.AbstractCashier;
import ua.com.pahaoks.store.entities.cashiers.FastCashier;
import ua.com.pahaoks.store.entities.customers.AbstractCustomer;
import ua.com.pahaoks.store.entities.exceptions.StoreException;
import ua.com.pahaoks.store.entities.stores.AbstractStore;

/**
 * Created by lutsishinpa on 14.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        try (AbstractStore store = AbstractStore.constructRandomized(10)) {
            System.out.println("Store started");

            for (int i = 0; i < 50; i++) {
                store.newCustomer(AbstractCustomer.constructRandomized());
            }
        } catch (StoreException ex) {
            System.out.println("Store has thrown a StoreException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Store has thrown some exception: " + ex.getMessage());
        }
    }
}
