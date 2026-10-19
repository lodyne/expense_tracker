package com.example.expensetracker.repository

import com.example.expensetracker.api.Budget
import com.example.expensetracker.api.Category
import com.example.expensetracker.api.ExpenseRequest
import com.example.expensetracker.api.ExpenseResponse
import com.example.expensetracker.api.Post
import com.example.expensetracker.api.PostResponse
import com.example.expensetracker.api.RetrofitClient

class PostRepository {

//    Act as mediator between the data sources and ViewModel
//    the data sources can be local database, remote database, cache etc.

    private val apiService = RetrofitClient.api

//    suspend fun getPosts(): List<Post>{
//        return apiService.getPosts()
//
//    }

   

    suspend fun getAllPosts(): List<Post>{
        val response = apiService.getAllPosts()
        return response.data

    }




}