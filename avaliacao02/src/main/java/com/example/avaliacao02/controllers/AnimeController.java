package com.example.avaliacao02.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/teste")
public class AnimeController {

    private RestClient cliente = RestClient.create("https://api.jikan.moe/v4/");

    @GetMapping("/anime")
    @ResponseBody
    public Map<String, Object> valor(@RequestParam String animeID){

        Map<String, Object> resposta = cliente
                .get()
                .uri("anime/" + animeID)
                .retrieve()
                .body(Map.class);


        Map<String, Object> info = new HashMap<>();

        // Acessa o mapa "data"
        Map<String, Object> data = (Map<String, Object>) resposta.get("data");



        // Coloca o valor de "title" no Map "info"
        info.put("Titulos", data.get("titles"));

        return info;

        //https://docs.api.jikan.moe/#tag/anime/operation/getAnimeById
    }

}
