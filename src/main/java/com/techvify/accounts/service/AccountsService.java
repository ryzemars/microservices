/*
 * @(#)AccountsService.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.service;

import com.techvify.accounts.dto.CustomerDto;

/**
 * AccountsService.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
public interface AccountsService {

    /**
     * Creates a new account based on the provided customer information.
     *
     * @param customerDto A CustomerDto object containing the customer's details.
     */
    void createAccount(CustomerDto customerDto);
}
