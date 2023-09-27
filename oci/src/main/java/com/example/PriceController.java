/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;

import java.util.List;
import java.util.Optional;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 *
 * @author MRINNE
 */
@Controller("/price")
public class PriceController {

    private final PriceRepository priceRepository;

    PriceController(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Get(uri = "/", produces = "application/json")
    public List<Price> all() {
        return priceRepository.findAll();
    }

    @Get(uri = "/{tier}", produces = "application/json")
    Optional<Price> byTier(String tier) {
        return priceRepository.findByTier(tier.toUpperCase());
    }
}
