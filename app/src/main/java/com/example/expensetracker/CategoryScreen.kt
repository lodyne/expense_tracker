package com.example.expensetracker

import androidx.compose.runtime.Composable
import com.example.expensetracker.screens.CategoryList
import com.example.expensetracker.screens.PostList
import com.example.expensetracker.viewmodel.CategoryViewModel
import com.example.expensetracker.viewmodel.PostViewModel

@Composable
fun CategoryScreen(viewModel: CategoryViewModel){
    val categories = viewModel.categories
    CategoryList(categories = categories)

}