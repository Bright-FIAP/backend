package br.com.fiap.chefbotapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

    @GetMapping(path = "/teste")
    public String hello(){
        return "hello world!";
    }
}
