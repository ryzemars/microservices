/*
 * @(#)ErrorResponseDto.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * ErrorResponseDto.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
public class ErrorResponseDto {
    /*
     * Represent the api path that my client application is trying to invoke.
     * When we access that path and failed, the errorResponseDto will show the path as well.
     * And the errorCode to represent the http status code, the errorResponseDto will show the error code as well.
     * Same as error message to show what kind of error is it.
     * And the error time to show when the error is occurred.
     * */
    private String apiPath;
    private HttpStatus errorCode;
    private String errorMessage;
    private LocalDateTime errorTime;
}
