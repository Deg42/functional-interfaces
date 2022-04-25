package es.fpdual.bifunctioAndPredicate;

import java.util.Arrays;
import java.util.List;

import es.fpdual.model.Car;

public class BifunctionAndPredicateMain {
    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car("Skoda", "Fabia", 1500.6, 2001),
                new Car("Skoda", "Octavia", 7050.3, 2014),
                new Car("Ford", "Fiesta", 13200.16, 2017),
                new Car("Skoda", "Octavia", 2000.9, 2003));

        CarUtility utility = new CarUtility();

        List<Car> carsOf2010OnwardsList = utility.getCarsOf2010Onwards(carList, car -> car.getLicenseAge() > 2010);

        for (Car car : carsOf2010OnwardsList) {
            double newPrice = utility.priceIncremet(car, 10, (price, increment) -> price + (price * (increment / 100)));

            car.setPrice(newPrice);
        }

        System.out.println("Price updated in cars of 2010 onwards: ");
        for (Car car : carList) {
            System.out
                    .println(
                            "Model: " + car.getModel() + " | Brand: " + car.getBrand() + " | Price: " + car.getPrice());
        }
    }

}
