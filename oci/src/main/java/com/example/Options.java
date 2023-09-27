/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;

import java.math.BigDecimal;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable.Serializable;

/**
 *
 * @author MRINNE
 */
@Serializable
@MappedEntity
public class Options {

    @Id
    private String tier;
    private BigDecimal id;
    private String ispublic;
    private String isprivate;
    private String ispermissions;
    private String issharing;
    private String isunlimited;
    private String isextrasec;

    public Options() {
    }

    public Options(BigDecimal id) {
        this.id = id;
    }

    public Options(BigDecimal id, String tier) {
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

    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    public String getIsprivate() {
        return isprivate;
    }

    public void setIsprivate(String isprivate) {
        this.isprivate = isprivate;
    }

    public String getIspermissions() {
        return ispermissions;
    }

    public void setIspermissions(String ispermissions) {
        this.ispermissions = ispermissions;
    }

    public String getIssharing() {
        return issharing;
    }

    public void setIssharing(String issharing) {
        this.issharing = issharing;
    }

    public String getIsunlimited() {
        return isunlimited;
    }

    public void setIsunlimited(String isunlimited) {
        this.isunlimited = isunlimited;
    }

    public String getIsextrasec() {
        return isextrasec;
    }

    public void setIsextrasec(String isextrasec) {
        this.isextrasec = isextrasec;
    }

}
