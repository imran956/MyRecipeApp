package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


/*Imagine it as it is a establishing a connection between our app to that api.This connection
 would be established by retrofit. here retrofit object is a wire inside that wire is a converter
 so that whenever code pass through this wire it will be converted to kotlin object form.*/


private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

/*here consider recipeService as plug which will be inserted into both side
 in application and JSON file to establish a connection*/
val recipeService = retrofit.create(ApiServices::class.java)

interface ApiServices {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}