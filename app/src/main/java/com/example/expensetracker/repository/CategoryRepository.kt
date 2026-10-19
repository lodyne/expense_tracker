package com.example.expensetracker.repository

import com.example.expensetracker.api.Category
import com.example.expensetracker.api.RetrofitClient

class CategoryRepository {

    private val apiService = RetrofitClient.api

    suspend fun getCategories() : List<Category> {
        val response =  apiService.getCategories()
        return response
    }
}