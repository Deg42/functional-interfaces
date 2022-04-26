package es.fpdual.supplier;

import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        Supplier<String> i = () -> "Juan";
        System.out.println("Value is: " + i.get());
    }
}
