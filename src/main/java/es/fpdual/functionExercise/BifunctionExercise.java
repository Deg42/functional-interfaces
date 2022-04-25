package es.fpdual.functionExercise;

import java.util.function.BiFunction;

public class BifunctionExercise {

    public static void main(String[] args) {
        BiFunction<String, String, String> bifunction = (x, y) -> x + y;

        System.out.println(bifunction.apply("Hello ", "World!"));
    }
}
