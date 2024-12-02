/*
 * @(#)CustomerMapper.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.mapper;

import com.techvify.accounts.dto.CustomerDto;
import com.techvify.accounts.entity.Customer;

/**
 * CustomerMapper: Mapping CustomerDto to Customer entity and vice versa.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
public class CustomerMapper {
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
