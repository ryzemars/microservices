/*
 * @(#)AccountsMapper.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.mapper;

import com.techvify.accounts.dto.AccountsDto;
import com.techvify.accounts.entity.Accounts;

/**
 * AccountsMapper: Mapping AccountsDto to Accounts entity and vice versa.
 * But suggest using Mapstruct library.
 * Or using model mapper library.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
