/*
 * @(#)AccountsConstants.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.constant;

/**
 * AccountsConstants.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
public class AccountsConstants {

    /*
     * This private constructor prevents instantiation of this class.
     * Because I don't want anyone to create an object of this class (don't want to instantiate this class).
     * The reason is: Inside this class, only want to maintain constants instead of other methods or business logic here.
     *
     * Also, I'm using static keyword for all the constants. So I can invoke them and use them with the help of class name itself.
     * */
    private AccountsConstants() {
        // restrict instantiation
    }

    public static final String  SAVINGS = "Savings";
    public static final String  ADDRESS = "123 Main Street, New York";
    public static final String  STATUS_201 = "201";
    public static final String  MESSAGE_201 = "Account created successfully";
    public static final String  STATUS_200 = "200";
    public static final String  MESSAGE_200 = "Request processed successfully";
    public static final String  STATUS_417 = "417";
    public static final String  MESSAGE_417_UPDATE= "Update operation failed. Please try again or contact Dev team";
    public static final String  MESSAGE_417_DELETE= "Delete operation failed. Please try again or contact Dev team";
    // public static final String  STATUS_500 = "500";
    // public static final String  MESSAGE_500 = "An error occurred. Please try again or contact Dev team";

}
