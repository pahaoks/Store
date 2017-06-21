package ua.com.pahaoks.store.entities.customers;

import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Strategy;
import ua.com.pahaoks.store.entities.annotations.CashierAnnotation;
import ua.com.pahaoks.store.entities.exceptions.CustomerException;
import ua.com.pahaoks.store.entities.strategies.customerStrategies.CustomerForFastCashierStrategy;
import ua.com.pahaoks.store.entities.strategies.customerStrategies.CustomerForLazyCashierStrategy;
import java.lang.Class;
import java.util.Random;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public abstract class AbstractCustomer implements Customer {
    private static final int AVERAGE_BUY_TIME = 30;
    private final Random random = new Random();

    public static AbstractCustomer constructRandomized() {
        switch (new Random().nextInt(2)) {
            case 0: return new AngryCustomer();
            case 1: return new PatientCustomer();
            default: return null;
        }
    }

    @Override
    public int buyGoods() throws CustomerException {
        return random.nextInt(AVERAGE_BUY_TIME) + delay();
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
