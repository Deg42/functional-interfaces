package es.fpdual.bifunctioAndPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import es.fpdual.model.Car;

public class CarUtility {

    public List<Car> evaluate(List<Car> carList, Predicate<Car> eval) {
        List<Car> newList = new ArrayList<>();

        for (Car car : carList) {
            if (eval.test(car))
                newList.add(car);
        }

        return newList;
    }

    public double priceIncremet(Car car, double increment, BiFunction<Double, Double, Double> bi) {
        return bi.apply(car.getPrice(), increment);
    }
}
