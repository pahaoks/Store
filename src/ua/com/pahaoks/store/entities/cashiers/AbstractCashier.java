package ua.com.pahaoks.store.entities.cashiers;

import ua.com.pahaoks.store.entities.Cashier;
import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Strategy;

import java.util.Random;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public abstract class AbstractCashier implements Cashier {
    private static final int AVERAGE_SCAN_TIME = 20;
    private final Random random = new Random();

    public static AbstractCashier constructRandomized() {
        switch(new Random().nextInt(2)) {
            case 0: return new FastCashier();
            case 1: return new LazyCashier();
            default: return null;
        }
    }

    @Override
    public int sellGoods(Customer customer) {
        return random.nextInt(AVERAGE_SCAN_TIME) + delay();
    }

    public abstract int delay();
}
