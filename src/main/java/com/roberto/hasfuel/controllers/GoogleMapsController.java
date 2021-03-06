package com.roberto.hasfuel.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.roberto.hasfuel.domain.models.GetGasStationsModel;

@RestController
@RequestMapping("/api/maps")
public class GoogleMapsController {
    private final Logger log = LoggerFactory.getLogger(GoogleMapsController.class);

    @GetMapping(value = "/getGasStations", consumes = "application/json",  produces="application/json")
    public void getGasStations(@RequestBody GetGasStationsModel params) {

    }
}
