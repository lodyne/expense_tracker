package com.example.expensetracker.repository

import com.example.expensetracker.api.Budget
import com.example.expensetracker.api.RetrofitClient

class BudgetRepository {
    private val apiService = RetrofitClient.api;

    suspend fun getBudgets() : List<Budget>{
        val response = apiService.getBudgets()
        return response
    }
}