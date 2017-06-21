package ua.com.pahaoks.store.entities;

import ua.com.pahaoks.store.entities.exceptions.CashierException;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public interface Cashier extends Human {
    int sellGoods(Customer customer) throws CashierException;
}
