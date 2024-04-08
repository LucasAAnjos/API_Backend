package com.adrianjos.avaliacao02.services;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface RecipeInterface {
    public Object getRecipes();
}
