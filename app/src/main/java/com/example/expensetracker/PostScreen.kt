package com.example.expensetracker

import androidx.compose.runtime.Composable
import com.example.expensetracker.screens.PostList
import com.example.expensetracker.viewmodel.PostViewModel

@Composable
fun PostScreen(viewModel: PostViewModel){
    val posts = viewModel.posts
    PostList(posts = posts)

}