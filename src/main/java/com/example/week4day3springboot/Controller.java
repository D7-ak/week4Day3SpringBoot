package com.example.week4day3springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/name")
    public  String myName(){
        return "My name is abdulrahman";
    }
    @GetMapping("/age")
    public String age(){
        return "my age27";
    }
    @GetMapping("/check/status")
    public String check(){
        return "every thing is ok";
    }
    @GetMapping("/health")
    public String helth(){
        return "the server is up and running";
    }
    @GetMapping("/names")
    public String[] names(){
        String[] names = {"ali","ahmad"};
        return names;
    }


}
