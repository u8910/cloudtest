package org.example.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Order")
public interface order {
    @GetMapping("/hh")
    String hh1();
}
