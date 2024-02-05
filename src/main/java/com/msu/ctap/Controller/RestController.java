package com.msu.ctap.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/connect")
    public void connect(){
        System.out.println("Spring Boot Application Connected.");
    }
}
