package ua.com.pahaoks.store.entities.annotations;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public @interface CashierAnnotation {
    public enum Speed { Fast, Low }

    public Speed speed() default Speed.Fast;
}
