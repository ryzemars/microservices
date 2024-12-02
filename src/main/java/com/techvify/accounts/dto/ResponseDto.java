/*
 * @(#)ResponseDto.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * ResponseDto.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
public class ResponseDto {
    /*
     * The statusCode is going to send what is the status code to my client application (ex 200 if successful, 500 if internal server error).
     * And the status message to send the message to my client application.
     *
     * These 2 fields will make client easily to understand whether the given operation is successful or not.
     * */
    private String statusCode;

    private String statusMsg;
}
