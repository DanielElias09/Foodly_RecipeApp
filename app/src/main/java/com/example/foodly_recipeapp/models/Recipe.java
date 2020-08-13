package com.example.foodly_recipeapp.models;

public class Recipe {
    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;

    public Recipe(String recipeName, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail) {
        RecipeName = recipeName;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;
    }

    //getters
    public String getRecipeName() {
        return RecipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    //setters
    public void setRecipeName(String recipeName) {
        RecipeName = recipeName;
    }

    public void setRecipeIngredients(String recipeIngredients) {
        RecipeIngredients = recipeIngredients;
    }

    public void setRecipeMethodTitle(String recipeMethodTitle) {
        RecipeMethodTitle = recipeMethodTitle;
    }

    public void setRecipe(String recipe) {
        Recipe = recipe;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
