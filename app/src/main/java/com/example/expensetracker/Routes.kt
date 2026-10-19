package com.example.expensetracker

sealed class Routes(val routes: String){
    object Expense: Routes("expense")
    object Home : Routes("home")
    object ExpenseData : Routes("expense_data")

}