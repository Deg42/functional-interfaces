package es.fpdual.functionExercise;

import java.util.function.Function;

public class FunctionalExercise {
    public static void main(String[] args) {
        /*
         * Function<Integer, String> coneverter = new Function<Integer, String>() {
         * 
         * @Override
         * public String apply(Integer t) {
         * return Integer.toString(t);
         * }
         * 
         * };
         */

        Function<Integer, String> converter = x -> Integer.toString(x);

        System.out.println(converter.apply(3).length());
        System.out.println(converter.apply(30000).length());
    }
}
