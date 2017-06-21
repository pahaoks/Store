package ua.com.pahaoks.store.entities;

import ua.com.pahaoks.store.entities.exceptions.CustomerException;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public interface Customer extends Human {
    int buyGoods() throws CustomerException;
}
