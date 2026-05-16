package com.mimie.simpleWebApp.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//here we define all routes but you can also use multiple controller files
//the front controller(behind the scenes) knows which request is coming from the client and which route to take
@RestController//returns only data not a page
//@Controller - returns a file(page)
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello home";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hello this is the about";
    }
}
