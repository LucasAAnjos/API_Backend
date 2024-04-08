package com.adrianjos.avaliacao02.controllers;

import com.adrianjos.avaliacao02.models.Request;
import com.adrianjos.avaliacao02.services.RecipeInterface;
import com.adrianjos.avaliacao02.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
    @Autowired
    private RecipeInterface recipeService;

    @PostMapping("/post")
    public ResponseEntity<Object> post(@RequestBody Request request) {
        return ResponseEntity.status(200).body(request);
    }



}
