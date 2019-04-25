package com.flairstect.springboot.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;
    
    @GetMapping("/")
    private String hello() {
        return "Welcome add a country code in the url";
    }


    @GetMapping("/{code}")
    private Country getCountry(@PathVariable String code) {
        return countryRepository.findByCode(code);
    }
}