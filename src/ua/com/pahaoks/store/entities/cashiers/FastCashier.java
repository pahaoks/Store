package ua.com.pahaoks.store.entities.cashiers;

import ua.com.pahaoks.store.entities.annotations.CashierAnnotation;
import ua.com.pahaoks.store.entities.annotations.CustomerAnnotation;
import ua.com.pahaoks.store.entities.Strategy;
import ua.com.pahaoks.store.entities.strategies.cashierStrategies.CashierForAngryCustomerStrategy;
import ua.com.pahaoks.store.entities.strategies.cashierStrategies.CashierForPatientCustomerStrategy;

import java.util.Random;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
@CashierAnnotation( speed = CashierAnnotation.Speed.Fast)
public class FastCashier extends AbstractCashier {

    @Override
    public int delay() {
        return new Random().nextInt(10);
    }

    @Override
    public Strategy strategy(Class customerClass) {
        if (customerClass.isAnnotationPresent(CustomerAnnotation.class)) {
            CustomerAnnotation annotation = (CustomerAnnotation) customerClass.getAnnotation(CustomerAnnotation.class);
            switch (annotation.temper()) {
                case angry: return new CashierForAngryCustomerStrategy(this);
                case patient: return new CashierForPatientCustomerStrategy(this);
                default: return null;
            }
        }
        return null;
    }
}
