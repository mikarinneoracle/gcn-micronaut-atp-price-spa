/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;

import java.util.Optional;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 *
 * @author MRINNE
 */
@Controller("/options")
public class OptionsController {

    private final OptionsRepository optionsRepository;

    OptionsController(OptionsRepository optionsRepository) {
        this.optionsRepository = optionsRepository;
    }

    @Get(uri = "/{tier}", produces = "application/json")
    Optional<Options> byTier(String tier) {
        return optionsRepository.findByTier(tier.toUpperCase());
    }

}
