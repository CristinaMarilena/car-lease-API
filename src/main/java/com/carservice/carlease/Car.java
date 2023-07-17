package com.carservice.carlease;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Car{

    String id;
    String cost;
    Integer kilometres;
    String color;
    String nameOwner;

    public static int compareByKms(Car a, Car b) {
        return a.getKilometres().compareTo(b.getKilometres());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", cost='" + cost + '\'' +
                ", kilometres=" + kilometres +
                ", color='" + color + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                '}';
    }
}