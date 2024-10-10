package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("process-form")
    public String getname(){
        return "My name is Haris and i love Joanna";
    }

    @GetMapping("process-form")
    public static  String getData(@RequestParam int num1, @RequestParam int num2){
        return String.valueOf( + num1 + num2) ;
    }
}
