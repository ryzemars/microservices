/*
 * @(#)AccountsDto.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AccountsDto: This dto will hold all the Accounts entity's fields that we want to send to the client application.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountsDto {
    /*
    * This dto will not have customerId field because I don't want to send customerId to my client application.
    * Because client don't need the specific Id that is automatically generated in our internal database.
    * → dto is also work as a filter to filtering the data (some fields) that we want to send to the client application or not.
    * */
    private String accountNumber;

    private String accountType;

    private String branchAddress;

}
