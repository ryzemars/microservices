/*
 * @(#)CustomerRepository.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.repository;

import com.techvify.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CustomerRepository.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
