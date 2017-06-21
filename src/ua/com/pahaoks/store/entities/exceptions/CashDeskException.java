package ua.com.pahaoks.store.entities.exceptions;

/**
 * Created by lutsishinpa on 19.06.2017.
 */
public class CashDeskException extends Exception {

    private static final String DEFAULT_MESSAGE = "CashDesk throws an error";

    public CashDeskException() {
        super(DEFAULT_MESSAGE);
    }
}
