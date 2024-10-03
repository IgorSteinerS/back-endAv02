package com.example.avaliacao02.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class sobreService {
    public static HashMap<String, String> sobre(){
        HashMap<String, String> info = new HashMap<>();
        info.put("estudante", "Igor Steiner de Souza");
        info.put("projeto","Requisição de animes");

        return info;
    }

}



