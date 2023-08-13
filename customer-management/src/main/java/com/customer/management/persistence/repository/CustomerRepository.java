package com.customer.management.persistence.repository;

import com.customer.management.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    // Add custom query methods if needed
}
