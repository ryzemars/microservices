/*
 * @(#)BaseEntity.java
 *
 * Copyright 2024 by esoft systems (tm).
 * All rights reserved.
 */

package com.techvify.accounts.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Version;
import lombok.experimental.SuperBuilder;
import jakarta.persistence.MappedSuperclass;

/**
 * BaseEntity.
 *
 * @author Daniel Tran - TVF
 * @since 1.0
 */
@Getter
@Setter
@ToString
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {
  @Column(updatable = false)
  private LocalDateTime createdAt;

  @Column(updatable = false)
  private String createdBy;

  @Column(insertable = false)
  private LocalDateTime updatedAt;

  @Column(insertable = false)
  private String updatedBy;

  @Version
  private long version;
}
