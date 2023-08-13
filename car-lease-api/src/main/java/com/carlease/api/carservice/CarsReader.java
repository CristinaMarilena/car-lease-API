package com.carlease.api.carservice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CarsReader {

    public List<Car> getCars() {

        List<Car> cars = new ArrayList<>();

        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert JSON array to list of cars
            cars = Arrays.asList(mapper.readValue(
                    Objects.requireNonNull(Thread.currentThread()
                            .getContextClassLoader()
                            .getResourceAsStream("cars.json")), Car[].class));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return cars;
    }
}
