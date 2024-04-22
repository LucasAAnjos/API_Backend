package com.adrianjos.avaliacao02.services;

import com.adrianjos.avaliacao02.models.RecipeList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
public class RecipeService{
    static RestClient client = RestClient.create("https://themealdb.com/api/json/v1/1/");

    public RecipeList getRecipes(String name){
        System.out.println("www.themealdb.com/api/json/v1/1/" + "search.php?s=" + name);
        return client
            .get()
            .uri("search.php?s=" + name)
            .retrieve()
            .body(RecipeList.class);

    }
}
