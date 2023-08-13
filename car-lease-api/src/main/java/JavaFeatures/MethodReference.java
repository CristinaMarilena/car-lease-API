package JavaFeatures;

import com.carlease.api.carservice.Car;
import com.carlease.api.carservice.CarsReader;

import java.util.*;

/**
 * We own a car dealership business. Sort the available cars by the number of kms.
 */
public class MethodReference {

    static CarsReader carsReader = new CarsReader();

    static class CarKmsComparator implements Comparator<Car> {
        public int compare(Car a, Car b) {
            return a.getKilometres().compareTo(b.getKilometres());
        }
    }

    public static void main(String[] args) {

        List<Car> cars = carsReader.getCars();

        // print cars
        cars.forEach(System.out::println);

        //Native way -> use a Comparator
        List<Car> availableCars1 = cars;
        Collections.sort(availableCars1, new CarKmsComparator());
        System.out.println("Comparator method");
        cars.forEach(System.out::println);

        //Java 8 -> method reference
        List<Car> availableCars2 = cars;
        Collections.sort(availableCars2, Car::compareByKms);
        System.out.println("Java 8 method reference");
        cars.forEach(System.out::println);
    }
}
