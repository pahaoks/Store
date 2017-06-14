package ua.com.pahaoks.store.entities.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CashierAnnotation {
    public enum Speed { Fast, Low }

    public Speed speed() default Speed.Fast;
}
