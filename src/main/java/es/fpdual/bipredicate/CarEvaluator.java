package es.fpdual.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

import es.fpdual.model.Car;

public class CarEvaluator {
    public List<Car> evaluate(List<Car> carList, BiPredicate<String, Integer> eval) {
        List<Car> newList = new ArrayList<>();

        for (Car car : carList) {
            if (eval.test(car.getBrand(), car.getLicenseAge())) {
                newList.add(car);
            }
        }

        return newList;
    }
}
