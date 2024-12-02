/*
 * @(#)AccountsController.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.controller;


import com.techvify.accounts.constant.AccountsConstants;
import com.techvify.accounts.dto.CustomerDto;
import com.techvify.accounts.dto.ResponseDto;
import com.techvify.accounts.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountsController.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */

/*
 * We are going to support the return data type as JSON → can use produces = {MediaType.APPLICATION_JSON_VALUE}.
 * This confirm to the spring boot framework that the REST API is supporting the response type as JSON.
 * Normally, we don't need this config because the default response type is JSON thanks to the spring-boot-starter-web dependency.
 *
 * → But if we use it, the API is more consistent because it will always return the response with the response type as JSON no matter what the client
 * requires any type of response.
 * */
@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        /*
        * Using the ResponseEntity is the standard that we should follow:
        * Whenever an account is created successfully, we are sending a response back to the client saying that the account was created successfully.
        * The status HttpStatus.CREATED will go in the response header.
        * And inside the body, we also send status as 201 (Created) and the message that the account was created successfully.
        *
        * The Response Entity supports us send a lot of information inside the Response to the client applications.
        * If we return only the Dto back to the client, they will not receive the overall status.
        *
        * */
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(ResponseDto.builder().statusCode(AccountsConstants.STATUS_201).statusMsg(AccountsConstants.MESSAGE_201).build());
    }

}
