package com.example.avaliacao02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;

@RestController
public class sobreController {


        @GetMapping("/sobre")
        @ResponseBody
        public HashMap<String, String> sobre(){
            HashMap<String, String> info = new HashMap<>();
            info.put("estudante", "Igor Steiner de Souza");
            info.put("projeto","Requisição de animes");

            return info;
        }

}
