package com.example.expensetracker.repository

import com.example.expensetracker.api.ExpenseRequest
import com.example.expensetracker.api.ExpenseResponse
import com.example.expensetracker.api.RetrofitClient

class ExpenseRepository {
    private val apiService = RetrofitClient.api;

    suspend fun addExpense(expense : ExpenseRequest) : ExpenseResponse {
        return apiService.addExpense(expense)
    }

    suspend fun getAllExpenses() : List<ExpenseResponse>{
        return apiService.getAllExpenses()
    }
}