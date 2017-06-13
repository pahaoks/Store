package ua.com.pahaoks.store.entities.annotations;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public @interface CustomerAnnotation {
    public enum Temper { angry, patient, shortTempered }

    Temper temper() default Temper.patient;
}
