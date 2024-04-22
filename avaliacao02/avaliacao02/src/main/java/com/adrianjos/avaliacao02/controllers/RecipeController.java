package com.adrianjos.avaliacao02.controllers;

import com.adrianjos.avaliacao02.models.Recipe;
import com.adrianjos.avaliacao02.models.RecipeList;
import com.adrianjos.avaliacao02.models.Request;
import com.adrianjos.avaliacao02.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class RecipeController {

    @Autowired
    private RecipeService recipeService;
    private RecipeList recipeList;

    @PostMapping("/recipes")
    public ResponseEntity<Object> recipes(@RequestParam Optional<String> name, @RequestParam Optional<String> ingredient){
        RecipeList recipeList = recipeService.getRecipes(name.orElse(""));
        return ResponseEntity.status(200).body(recipeList);
    }

    @PostMapping("/search")
    public ResponseEntity<RecipeList> search(@RequestBody Request request) {

        RecipeList recipeList = new RecipeList();
        List<Recipe> meals = recipeService.getRecipes(request.getStrMeal()).getMeals();
        recipeList.setMeals(meals);
        return ResponseEntity.status(200).body(recipeList);
    }

    @GetMapping("/ajuda")
    public ResponseEntity<HashMap<String, Object>> ajuda() {
        return ResponseEntity.status(200).body(new HashMap<String, Object>(){
            {
                put("estudante", "Lucas A. dos Annjos");
                put("projeto", "Pesquisa de receitas");
            }
        });
    }

}
