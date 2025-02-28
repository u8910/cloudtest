package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gg {

    @Autowired
    private order order;

    @GetMapping("/gg")
    public String gg1() {
        return order.hh1();
    }
}
