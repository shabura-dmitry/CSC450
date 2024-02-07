package com.msu.ctap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @GetMapping(value = {"","/","/home","/home/"})
    public String home(){
        return "home";
    }
}
