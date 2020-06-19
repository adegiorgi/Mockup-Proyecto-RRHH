package com.mobydigitalrrhh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
	
    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }
}
