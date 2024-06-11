package com.example.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//making parcelable is neccessary to tranfer an object from one screen to another screen
//in parcelization there are two thing serialization and deserialization
//serialization -> to convert object into string so that it can be transferred from one screen to another
//deserialization -> to convert string into object to use its property
@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
) : Parcelable


data class CategoriesResponse(val categories: List<Category>)