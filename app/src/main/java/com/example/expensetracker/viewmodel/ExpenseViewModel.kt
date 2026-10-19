package com.example.expensetracker.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.expensetracker.api.ExpenseRequest
import com.example.expensetracker.api.ExpenseResponse
import com.example.expensetracker.repository.ExpenseRepository
import kotlinx.coroutines.launch

class ExpenseViewModel : ViewModel() {
    private val expenseRepository = ExpenseRepository()

    var postExpense by mutableStateOf<ExpenseResponse?>(null)
        private set

    var expenses by mutableStateOf<List<ExpenseResponse>>(emptyList())
        private set

    fun addExpense(name: String, amount: Int, categoryId: String, budgetId: String){
        viewModelScope.launch {
            val response = expenseRepository.addExpense(ExpenseRequest(name,amount,categoryId,budgetId))
            postExpense = response

            expenses = expenses + response
        }
    }

    fun loadExpenses(){
        viewModelScope.launch {
            expenses = expenseRepository.getAllExpenses()
        }
    }


}