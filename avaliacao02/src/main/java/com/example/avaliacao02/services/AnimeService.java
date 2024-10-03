package com.example.avaliacao02.services;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class AnimeService {
    private final RestClient cliente;
    private List<Map<String, Object>> favoritos = new ArrayList<>();

    public AnimeService() {
        this.cliente = RestClient.create("https://api.jikan.moe/v4/");
    }

    public Map<String, Object> buscarAnimePorId(String animeID) {
        Map<String, Object> resposta = cliente
                .get()
                .uri("anime/" + animeID)
                .retrieve()
                .body(Map.class);

        Map<String, Object> info = new LinkedHashMap<>();

        // Acessa o mapa "data"
        Map<String, Object> data = (Map<String, Object>) resposta.get("data");

        info.put("ID", data.get("mal_id"));
        info.put("Título default", data.get("title"));
        info.put("Título em Inglês", data.get("title_english"));
        info.put("Pontuação", data.get("score"));
        info.put("Episódios", data.get("episodes"));
        info.put("Ano", data.get("year"));
        info.put("Sinopse", data.get("synopsis"));

        return info;
    }

    public String adicionarFavorito(String animeID) {
        Map<String, Object> anime = buscarAnimePorId(animeID);
        favoritos.add(anime);
        return "Anime adicionado aos favoritos!";
    }

    public List<Map<String, Object>> listarFavoritos() {
        return favoritos;
    }
}


