package com.weiwz.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlle {

    @GetMapping("/hello")
    public String hello(){
    return "hello spring boot3!";
    }
}
