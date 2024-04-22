package com.adrianjos.avaliacao02.models;

import java.util.ArrayList;

public class Request {

    private String strMeal;
    private String strInstructions;

    public Request(String strMeal, String strInstructions) {
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
