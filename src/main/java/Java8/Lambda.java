package Java8;

import com.carservice.carlease.Car;
import com.carservice.carlease.CarsReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * We own a car dealership business. To discard all the paperwork,
 * we want to create a piece of software that finds all currently available cars
 * that have run less than 30,000 km.
 */
public class Lambda {

    static CarsReader carsReader = new CarsReader();

    public static void main(String[] args) {

        List<Car> cars = carsReader.getCars();
        List<Car> availableCars = new ArrayList<>();

        // print cars
        cars.forEach(System.out::println);

        //native way
        for (Car car: cars){
            if (car.getKilometres().compareTo(30000) < 0 ) {
                availableCars.add(car);
            }
        }

        // print cars
        System.out.println("Native way");
        availableCars.forEach(System.out::println);

        //Java 8

        availableCars = cars.stream()
                .filter(car -> car.getKilometres().compareTo(30000) < 0)
                .collect(Collectors.toList());

        System.out.println("Java 8 way");
        availableCars.forEach(System.out::println);
    }
}
