package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "springboot-hello word!!!";
    }
}
