package com.example.expensetracker.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetracker.GenerateColors
import com.example.expensetracker.api.Post

@Composable
fun PostItem(post: Post){


    Card(
        colors = CardDefaults.cardColors(
            containerColor = GenerateColors().generateRandomColor()
        ),
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)

    ){
        Text(
            text = post.title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleMedium

        )
        Text(
            text = post.body,
            fontSize = 12.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.bodyMedium
        )

    }

}