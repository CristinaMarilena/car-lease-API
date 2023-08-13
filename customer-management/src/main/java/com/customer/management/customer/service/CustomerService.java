package com.customer.management.customer.service;

import com.customer.management.customer.controller.dto.CustomerRegistrationRequest;
import com.customer.management.customer.controller.dto.CustomerRegistrationResponse;

public interface CustomerService {

    CustomerRegistrationResponse registerCustomer(CustomerRegistrationRequest request);

    // Other methods for customer-related actions
}
