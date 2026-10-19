package com.example.expensetracker.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.expensetracker.api.Post
import com.example.expensetracker.repository.PostRepository
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    private val repository = PostRepository()

    var posts by mutableStateOf<List<Post>>(emptyList())
        private set

    init {
        viewModelScope.launch{

//            fetching data
//            val fetchPosts = repository.getPosts()
            val fetchPosts = repository.getAllPosts()

//            updating the state
            posts = fetchPosts
        }
    }
}