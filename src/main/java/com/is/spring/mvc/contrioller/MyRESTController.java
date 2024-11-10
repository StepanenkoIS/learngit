package com.is.spring.mvc.contrioller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @GetMapping("/test")
    public String testApi() {
        return "Hello world!";
    }

    @GetMapping("/new")
    public String newTest() {
        return "Hello new world!";
    }

}
