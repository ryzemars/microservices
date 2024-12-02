/*
 * @(#)AccountsServiceImpl.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.service.impl;

import com.techvify.accounts.dto.CustomerDto;
import com.techvify.accounts.repository.AccountsRepository;
import com.techvify.accounts.repository.CustomerRepository;
import com.techvify.accounts.service.AccountsService;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

/**
 * AccountsServiceImpl.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */

/*
 * Using @Service annotation to indicate to spring boot framework that this class is going to act as a service layer.
 * So please create a bean of this class and inject it into the controller class.
 * Once the bean is created by spring boot framework, I can auto-wire (inject) this bean into the controller layer.
 *
 * When implement methods from AccountsService interface, should have tick to the Copy JavaDoc, Generate missed JavaDoc, Insert @Override.
 * */
@Service
@AllArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * Creates a new account based on the provided customer information.
     *
     * @param customerDto A CustomerDto object containing the customer's details.
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
