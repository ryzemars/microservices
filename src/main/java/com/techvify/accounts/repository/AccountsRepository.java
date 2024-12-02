/*
 * @(#)AccountsRepository.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.repository;

import com.techvify.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * AccountsRepository.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
