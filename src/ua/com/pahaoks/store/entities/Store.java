package ua.com.pahaoks.store.entities;

import ua.com.pahaoks.store.entities.exceptions.StoreException;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public interface Store {
    void newCustomer(Customer customer) throws StoreException;
}
