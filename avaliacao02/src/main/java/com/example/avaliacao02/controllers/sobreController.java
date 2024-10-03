package com.example.avaliacao02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.avaliacao02.services.*;

import java.util.HashMap;

@RestController
public class sobreController {


    @GetMapping("/sobre")
    @ResponseBody
    public HashMap<String, String> sobre(){
        return sobreService.sobre();
    }
}
