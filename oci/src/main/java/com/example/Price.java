/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;

import java.math.BigDecimal;
import java.math.BigInteger;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable.Serializable;

/**
 *
 * @author MRINNE
 */
@Serializable
@MappedEntity
public class Price {

    @Id
    private BigDecimal id;
    private String tier;
    private BigInteger priceMo;
    private BigInteger users;
    private BigInteger storage;
    private String support;

    public Price() {
    }

    public Price(BigDecimal id) {
        this.id = id;
    }

    public Price(BigDecimal id, String tier) {
        this.id = id;
        this.tier = tier;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public BigInteger getPriceMo() {
        return priceMo;
    }

    public void setPriceMo(BigInteger priceMo) {
        this.priceMo = priceMo;
    }

    public BigInteger getUsers() {
        return users;
    }

    public void setUsers(BigInteger users) {
        this.users = users;
    }

    public BigInteger getStorage() {
        return storage;
    }

    public void setStorage(BigInteger storage) {
        this.storage = storage;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

}
