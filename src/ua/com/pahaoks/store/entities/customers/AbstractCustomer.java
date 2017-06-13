package ua.com.pahaoks.store.entities.customers;

import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Strategy;
import ua.com.pahaoks.store.entities.annotations.CashierAnnotation;
import ua.com.pahaoks.store.entities.strategies.customerStrategies.CustomerForFastCashierStrategy;
import ua.com.pahaoks.store.entities.strategies.customerStrategies.CustomerForLazyCashierStrategy;

import java.util.Random;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public abstract class AbstractCustomer implements Customer {
    private final Random random = new Random();

    @Override
    public int buyGoods() {
        return random.nextInt(30) + delay();
    }

    protected abstract int delay();

    @Override
    public Strategy strategy(Class cashierClass) {
        if (cashierClass.isAnnotationPresent(CashierAnnotation.class)) {
            CashierAnnotation annotation = (CashierAnnotation) cashierClass.getAnnotation(CashierAnnotation.class);

            switch (annotation.speed()) {
                case Low: return new CustomerForLazyCashierStrategy(this);
                case Fast: return new CustomerForFastCashierStrategy(this);
                default: return null;
            }
        }
        return null;
    }
}
