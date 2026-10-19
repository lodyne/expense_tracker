package com.example.expensetracker.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.expensetracker.api.Category
import com.example.expensetracker.api.Post

@Composable
fun CategoryList(categories: List<Category>){
    LazyColumn {
        items(categories){
                category -> CategoryItem(category = category)
        }
    }

}
