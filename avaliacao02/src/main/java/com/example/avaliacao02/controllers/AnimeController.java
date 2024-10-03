package com.example.avaliacao02.controllers;


import com.example.avaliacao02.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


@RestController
public class AnimeController {

    @Autowired
    private AnimeService animeService;


    @GetMapping("/anime")
    @ResponseBody
    public Map<String, Object> valor(@RequestParam String animeID){
        return animeService.buscarAnimePorId(animeID);
    }

    @PostMapping("/favoritos")
    public String adicionarFavorito(@RequestBody Map<String, String> requestBody) {

        String animeID = requestBody.get("animeID");

        if (animeID == null || animeID.isEmpty()) {
            return "Anime ID is required!";
        }

        return animeService.adicionarFavorito(animeID);
    }

    @GetMapping("/favoritos")
    @ResponseBody
    public List<Map<String, Object>> listarFavoritos() {
        return animeService.listarFavoritos();
    }


}
