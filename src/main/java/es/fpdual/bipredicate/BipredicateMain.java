package es.fpdual.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import es.fpdual.model.Car;

public class BipredicateMain {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
        System.out.println(bp.test(2, 3));

        List<Car> carList = Arrays.asList(
                new Car("Skoda", "Fabia", 1500.6, 2001),
                new Car("Skoda", "Octavia", 7050.3, 1999),
                new Car("Ford", "Fiesta", 13200.16, 2017),
                new Car("Renaul", "Twingo", 2000.9, 1995),
                new Car("Skoda", "Scala", 2010.74, 2007),
                new Car("Renault", "Megane", 18302.29, 2011),
                new Car("Ferrari", "Testarossa", 1462.9, 1997));

        CarEvaluator evaluator = new CarEvaluator();

        BiPredicate<String, Integer> firstCriteria = (brand, liceseAge) -> (brand.equals("Skoda"))
                && (liceseAge < 2000);

        BiPredicate<String, Integer> secondCriteria = (brand, liceseAge) -> (brand.startsWith("F"))
                && (liceseAge >= 2000);

        BiPredicate<String, Integer> criteria = firstCriteria.or(secondCriteria);

        List<Car> carListUpdated = evaluator.evaluate(carList, criteria);
        System.out.println("Skoda cars with licese age < 2000");
        System.out.println("Cars brand starts with F and licese age > 2000");

        for (Car car : carListUpdated) {
            System.out
                    .println(
                            "Model: " + car.getModel() +
                                    " | Brand: " + car.getBrand() +
                                    " | Price: " + car.getPrice() +
                                    " | Age: " + car.getLicenseAge());
        }
    }

}
