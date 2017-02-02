package com.example.bookstore.com.example.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class BookController {
    @RequestMapping("/index")
    public String index(@RequestParam(name="book")String name){
        return "Hello " + name;
    }
}
