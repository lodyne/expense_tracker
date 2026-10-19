package com.example.expensetracker.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.expensetracker.api.Category
import com.example.expensetracker.repository.CategoryRepository
import com.example.expensetracker.repository.PostRepository
import kotlinx.coroutines.launch

class CategoryViewModel: ViewModel(){
    val postRepository = CategoryRepository()

    var categories by mutableStateOf<List<Category>>(emptyList())
        private set

    init {
        viewModelScope.launch {
            val fetchCategories = postRepository.getCategories()
            categories = fetchCategories

        }
    }
}