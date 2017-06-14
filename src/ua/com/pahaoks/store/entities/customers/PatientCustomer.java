package ua.com.pahaoks.store.entities.customers;

import ua.com.pahaoks.store.entities.annotations.CustomerAnnotation;
import ua.com.pahaoks.store.entities.Strategy;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
@CustomerAnnotation(temper = CustomerAnnotation.Temper.patient)
public class PatientCustomer extends AbstractCustomer {
    private static final int PATIENT_CUSTOMER_DELAY = 20;

    @Override
    protected int delay() {
        return PATIENT_CUSTOMER_DELAY;
    }

}
