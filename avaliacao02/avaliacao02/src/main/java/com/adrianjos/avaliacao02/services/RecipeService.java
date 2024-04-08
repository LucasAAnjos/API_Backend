package com.adrianjos.avaliacao02.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RecipeService implements RecipeInterface{
    private RestClient client = RestClient.create("www.themealdb.com/api/json/v1/1/");

    @Override
    public String getRecipes(){
        return "";
    }
}
