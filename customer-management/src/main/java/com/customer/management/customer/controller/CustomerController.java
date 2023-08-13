package com.customer.management.customer.controller;

import com.customer.management.customer.controller.dto.CustomerRegistrationRequest;
import com.customer.management.customer.controller.dto.CustomerRegistrationResponse;
import com.customer.management.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<CustomerRegistrationResponse> registerCustomer(
            @RequestBody CustomerRegistrationRequest request) {
        CustomerRegistrationResponse response = customerService.registerCustomer(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
