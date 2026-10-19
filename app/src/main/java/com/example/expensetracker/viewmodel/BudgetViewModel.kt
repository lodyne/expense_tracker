package com.example.expensetracker.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.expensetracker.api.Budget
import com.example.expensetracker.repository.BudgetRepository
import com.example.expensetracker.repository.PostRepository
import kotlinx.coroutines.launch

class BudgetViewModel: ViewModel(){
    val budgetRepository = BudgetRepository()

    var budgets by mutableStateOf<List<Budget>>(emptyList())
        private set

    init {
        viewModelScope.launch {
            val fetchBudgets = budgetRepository.getBudgets()
            budgets = fetchBudgets
        }
    }
}