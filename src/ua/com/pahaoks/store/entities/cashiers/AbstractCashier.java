package ua.com.pahaoks.store.entities.cashiers;

import ua.com.pahaoks.store.entities.Cashier;
import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Strategy;

import java.util.Random;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public abstract class AbstractCashier implements Cashier {
    private final Random random = new Random();

    @Override
    public int sellGoods(Customer customer) {
        return random.nextInt(20) + delay();
    }

    public abstract int delay();
}
