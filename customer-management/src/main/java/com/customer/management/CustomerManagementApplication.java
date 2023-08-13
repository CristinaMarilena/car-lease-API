package com.customer.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**- [ ]  You can maintain (read, add, change, and delete) basic customer attributes:

        o Name
        o Street
        o Housenumber
        o Zipcode
        o Place
        o Email address
        o Phone number**/

@SpringBootApplication
public class CustomerManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagementApplication.class, args);
    }
}