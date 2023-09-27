/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.example;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

/**
 *
 * @author MRINNE
 */
@JdbcRepository(dialect = Dialect.ORACLE)
public interface OptionsRepository extends CrudRepository<Options, BigDecimal> {

    @Override
    @NonNull
    List<Options> findAll();

    @Override
    @NonNull
    Optional<Options> findById(BigDecimal id);

    Optional<Options> findByTier(String tier);
}
