package ua.com.pahaoks.store.entities;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public interface Strategy<T> {
    int communicate(T receiver);
}
