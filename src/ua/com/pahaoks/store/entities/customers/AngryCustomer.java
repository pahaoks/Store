package ua.com.pahaoks.store.entities.customers;

import ua.com.pahaoks.store.entities.annotations.CustomerAnnotation;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
@CustomerAnnotation(temper = CustomerAnnotation.Temper.angry)
public class AngryCustomer extends AbstractCustomer {

    private static final int ANGRY_CUSTOMER_DELAY = 20;

    @Override
    protected int delay() {
        return ANGRY_CUSTOMER_DELAY;
    }

}
