package com.example.expensetracker.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {

//    @GET("posts")
//    suspend fun getPosts(): List<Post>

    @GET("posts")
    suspend fun getAllPosts(): PostResponse

    @GET("categories")
    suspend fun getCategories(): List<Category>

    @GET("budgets")
    suspend fun getBudgets(): List<Budget>

    @POST("expenses")
    suspend fun addExpense(@Body expense: ExpenseRequest): ExpenseResponse

    @GET("expenses")
    suspend fun getAllExpenses(): List<ExpenseResponse>
}