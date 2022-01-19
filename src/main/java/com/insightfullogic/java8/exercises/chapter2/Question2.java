package com.insightfullogic.java8.exercises.chapter2;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.function.Supplier;

public class Question2 {

    private static final Supplier<DateFormatter> formatterSupplier = () -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy"));
    public static ThreadLocal<DateFormatter> formatter
            = ThreadLocal.withInitial(formatterSupplier);

}
