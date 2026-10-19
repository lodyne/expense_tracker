package com.example.expensetracker.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetracker.api.Post

@Composable
fun PostList(posts: List<Post>){
    Text(
        text = "POSTS",
        fontSize = 14.sp,
        modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
    )
    LazyColumn(
        modifier = Modifier.padding(top = 16.dp)
    ) {
        items(posts){
            post -> PostItem(post = post)
        }
    }

}
