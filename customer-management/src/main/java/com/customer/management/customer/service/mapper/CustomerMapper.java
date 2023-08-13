package com.customer.management.customer.service.mapper;

import com.customer.management.customer.controller.dto.CustomerRegistrationRequest;
import com.customer.management.customer.controller.dto.CustomerRegistrationResponse;
import com.customer.management.persistence.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerRegistrationResponse entityToDto(CustomerEntity entity);

    CustomerEntity dtoToEntity(CustomerRegistrationRequest dto);
}
