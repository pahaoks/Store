package ua.com.pahaoks.store.entities.exceptions;

/**
 * Created by lutsishinpa on 19.06.2017.
 */
public class StoreException extends Exception {
    private static final String DEFAULT_MESSAGE = "Ошибка магазина";

    public StoreException() {
        super(DEFAULT_MESSAGE);
    }
}
