package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@Log4j2
@RequiredArgsConstructor

public class Controller {
    @GetMapping("/index")
    public String index(){
        return "/index";
    }
    @GetMapping("/collection")
    public String collection(){ return "/collection";}

    @GetMapping("/login")
    public String login(){ return "/login";}
    @GetMapping("/jingwon")
    public String jingwon(){ return "/jingwon";}

}
