/*
 * @(#)Customer.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Customer - the customer entity.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */


/*
 * The reason not using @Data instead of @Getter, @Setter, @ToString at the entities class because of don't want to generate equals and hashCode method.
 * Because sometimes equals and hashCode method is make the issues with the Spring data JPA framework.
 * But for Dto is ok so in Dto we can use @Data from lombok.
 * */
@Entity
@Table(name = "customer")
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_id")
  private Long customerId;

  @Column(name = "name")
  private String name;

  @Column(name = "email")
  private String email;

  @Column(name = "mobile_number")
  private String mobileNumber;
}
