package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appconfiguration {

@RequestMapping("/hello")
public String Hello(){
    return "Hello World";
}

}
