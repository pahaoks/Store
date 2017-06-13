package ua.com.pahaoks.store.entities.cashiers;

import ua.com.pahaoks.store.entities.Cashier;
import ua.com.pahaoks.store.entities.Customer;
import ua.com.pahaoks.store.entities.Strategy;
import ua.com.pahaoks.store.entities.annotations.CashierAnnotation;
import ua.com.pahaoks.store.entities.strategies.cashierStrategies.CashierForPatientCustomerStrategy;

import java.util.Random;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
@CashierAnnotation( speed = CashierAnnotation.Speed.Low)
public class LazyCashier extends AbstractCashier {

    @Override
    public Strategy strategy(Class customerClass) {
        return new CashierForPatientCustomerStrategy(this);
    }

    @Override
    public int delay() {
        return new Random().nextInt(50);
    }
}
