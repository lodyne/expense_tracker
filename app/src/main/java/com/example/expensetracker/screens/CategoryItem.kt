package com.example.expensetracker.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetracker.api.Category
import com.example.expensetracker.api.Post

@Composable
fun CategoryItem(category: Category){

    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)

    ){
        Text(
            text = category.name,
            fontSize = 12.sp,
            style = MaterialTheme.typography.titleMedium

        )


    }

}