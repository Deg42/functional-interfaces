package es.fpdual.unaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorMain {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        List<Integer> squareList = operate(num -> num * num, integerList);

        squareList.forEach(x -> System.out.println(x));
    }

    public static List<Integer> operate(UnaryOperator<Integer> unaryOp, List<Integer> list) {
        List<Integer> updatedList = new ArrayList<>();

        list.forEach(num -> updatedList.add(unaryOp.apply(num)));

        return updatedList;
    }

}
