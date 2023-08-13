package com.customer.management.customer.service;

import com.customer.management.customer.controller.dto.CustomerRegistrationRequest;
import com.customer.management.customer.controller.dto.CustomerRegistrationResponse;
import com.customer.management.customer.service.mapper.CustomerMapper;
import com.customer.management.persistence.entity.CustomerEntity;
import com.customer.management.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerRegistrationResponse registerCustomer(CustomerRegistrationRequest request) {
        CustomerEntity entity = CustomerMapper.INSTANCE.dtoToEntity(request);
        CustomerEntity savedEntity = customerRepository.save(entity);
        return CustomerMapper.INSTANCE.entityToDto(savedEntity);
    }
}
