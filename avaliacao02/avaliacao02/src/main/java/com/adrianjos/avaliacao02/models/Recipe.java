package com.adrianjos.avaliacao02.models;

public class Recipe {

    private String strMeal;
    private String strInstructions;

    public Recipe(String strMeal, String strInstructions) {
        this.strMeal = strMeal;
        this.strInstructions = strInstructions;
    }

    public String getStrMeal(){
        return this.strMeal;
    }

    public String getStrInstructions(){
        return this.strInstructions;
    }


}