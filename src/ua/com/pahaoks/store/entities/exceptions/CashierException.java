package ua.com.pahaoks.store.entities.exceptions;

/**
 * Created by lutsishinpa on 19.06.2017.
 */
public class CashierException extends Exception {
    private static final String DEFAULT_MESSAGE = "Ошибка кассира: ";

    public CashierException() {
        super(DEFAULT_MESSAGE);
    }
}
