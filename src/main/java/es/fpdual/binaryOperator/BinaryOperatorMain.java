package es.fpdual.binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorMain {
    public static void main(String[] args) {
        BinaryOperator<Integer> biOp = (x, y) -> x * y;

        int result = biOp.apply(10, 89);

        System.out.println("The product is: " + result);

        BinaryOperator<Integer> biOpMin = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        BinaryOperator<Integer> biOpMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));

        result = biOpMin.apply(10, 20);
        System.out.println("The smaller number is: " + result);

        result = biOpMax.apply(100, 84);
        System.out.println("The bigger number is: " + result);
    }
}
