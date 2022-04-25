package es.fpdual.bifunction;

import java.util.function.BiFunction;

public class Calculator {

    public String calculate(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
        return bi.apply(i1, i2);
    }

}
