package com.auth.com.springauthresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students")
    public String test() {
        return "Hello Mg Mg,SU Su,Hla hla";
    }
}
