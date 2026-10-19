package com.example.expensetracker

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController

@Composable
fun FloatingExpenseButton(navController: NavController){
    FloatingActionButton(
        onClick = { navController.navigate(Routes.Expense.routes) },
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary,
        shape = CircleShape,
        content = {
            Icon(
                painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = "Add Expense"
            )
        }

    )
}