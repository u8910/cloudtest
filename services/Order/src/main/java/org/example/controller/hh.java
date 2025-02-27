package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hh {

    @GetMapping("/hh")
    public String hh() {
        return "什么都不要";
    }
}
