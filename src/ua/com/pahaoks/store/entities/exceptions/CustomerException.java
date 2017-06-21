package ua.com.pahaoks.store.entities.exceptions;

/**
 * Created by lutsishinpa on 19.06.2017.
 */
public class CustomerException extends Exception {
    private static final String DEFAULT_MESSAGE = "Ошибка покупателя";

    public CustomerException() {
        super(DEFAULT_MESSAGE);
    }
}
