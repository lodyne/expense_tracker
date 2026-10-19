package com.example.expensetracker.api

import com.google.gson.annotations.SerializedName

data class ExpenseResponse(
    val name : String,
    val amount: Double,
    val category : Category,
    val budget : Budget
)

data class ExpenseRequest(
    @SerializedName("name")
    val name: String,

    @SerializedName("amount")
    val amount: Int,

    @SerializedName("category")
    val categoryId: String,

    @SerializedName("budget")
    val budgetId: String
)